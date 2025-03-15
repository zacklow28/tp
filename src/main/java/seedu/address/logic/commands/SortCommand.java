package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.Comparator;

import seedu.address.model.Model;
import seedu.address.model.person.Person;

/**
 * Sorts the patient list by priority (h > m > l) and then alphabetically by name.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";
    public static final String MESSAGE_SUCCESS = "Sorted patient list by %s.";
    public static final String MESSAGE_USAGE = "Usage: sort [priority|name|diet]";

    private final String sortType;

    public SortCommand(String sortType) {
        this.sortType = sortType;
    }

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);

        // Print list before sorting
        System.out.println("Before sorting: " + model.getFilteredPersonList());

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
        default:
            throw new IllegalArgumentException("Invalid sort type.");
        }

        model.sortFilteredPersonList(comparator);

        // Print list after sorting
        System.out.println("After sorting: " + model.getFilteredPersonList());

        return new CommandResult(String.format(MESSAGE_SUCCESS, sortType));
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
