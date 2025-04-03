package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.Comparator;

import seedu.address.model.Model;
import seedu.address.model.person.Person;

/**
 * Sorts the patient list by the specified attribute.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";
    public static final String MESSAGE_SUCCESS = "Sorted patient list by %s.";
    public static final String MESSAGE_USAGE = "Usage: sort priority | sort name | sort diet | sort meetingdate";

    private final String sortType;

    public SortCommand(String sortType) {
        this.sortType = sortType;
    }

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);

        Comparator<Person> comparator;
        switch (sortType) {
        case "priority":
            comparator = Comparator.comparing((Person p) -> p.getPriority().getValue().ordinal()).reversed()
                    .thenComparing(p -> p.getName().toString().toLowerCase());
            break;
        case "name":
            comparator = Comparator.comparing(p -> p.getName().toString().toLowerCase());
            break;
        case "diet":
            comparator = Comparator.comparing(p -> p.getDiet().toString().toLowerCase(),
                    String.CASE_INSENSITIVE_ORDER);
            break;
        case "meetingdate":
            comparator = Comparator.comparing(p -> p.getMeetingDate().toString());
            break;
        default:
            throw new IllegalArgumentException("Invalid sort type.");
        }

        model.sortFilteredPersonList(comparator);
        return new CommandResult(String.format(MESSAGE_SUCCESS, getPrettySortType(sortType)));
    }

    private String getPrettySortType(String type) {
        return switch (type) {
        case "priority" -> "priority";
        case "name" -> "name";
        case "diet" -> "diet";
        case "meetingdate" -> "meeting date";
        default -> type;
        };
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SortCommand)) {
            return false;
        }
        SortCommand otherCommand = (SortCommand) other;
        return this.sortType.equals(otherCommand.sortType);
    }
}
