package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.function.Predicate;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;

/**
 * Filters the list of patients based on the specified prefix and value.
 */
public class FilterCommand extends Command {
    public static final String COMMAND_WORD = "filter";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Filters the patient list based "
            + "on a prefix and value.\n"
            + "Parameters: [PREFIX]/[VALUE]\n"
            + "Example: " + COMMAND_WORD + " d/low fat\n"
            + "Valid prefixes: d/(diet), g/(gender), p/(priority), m/(meeting date)";

    private final String prefix;
    private final String value;

    /**
     * Constructs a {@code FilterCommand} with the given prefix and value.
     * The prefix represents the filter category (e.g., diet, gender, priority),
     * and the value is the filtering criterion.
     *
     * @param prefix The prefix representing the filter category (e.g., "d" for diet, "g" for gender).
     * @param value The value used to filter persons based on the given category.
     */
    public FilterCommand(String prefix, String value) {
        this.prefix = prefix.toLowerCase();
        this.value = value.toLowerCase();
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        // Apply the filter (no validation here anymore)
        Predicate<Person> filterPredicate = switch (prefix) {
        case "d" -> person -> person.getDiet().toString().equalsIgnoreCase(value);
        case "g" -> person -> person.getGender().toString().equalsIgnoreCase(value);
        case "pr" -> person -> person.getPriority().toString().equalsIgnoreCase(value);
        case "m" -> person -> person.getMeetingDate().toString().equals(value);
        default -> throw new CommandException("Unexpected error: invalid filter prefix passed execution.");
        };

        model.updateFilteredPersonList(filterPredicate);
        return new CommandResult("Filtered patients by " + prefix + ": " + value);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof FilterCommand otherFilterCommand) {
            return prefix.equals(otherFilterCommand.prefix) && value.equals(otherFilterCommand.value);
        }
        return false;
    }
}
