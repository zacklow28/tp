package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;

import java.util.function.Predicate;

/**
 * Filters the list of patients based on the specified prefix and value.
 */
public class FilterCommand extends Command {
    public static final String COMMAND_WORD = "filter";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Filters the patient list based on a prefix and value.\n"
            + "Parameters: [PREFIX]/[VALUE]\n"
            + "Example: " + COMMAND_WORD + " d/low fat\n"
            + "Valid prefixes: d/ (diet), g/ (gender), p/ (priority), a/ (food allergies), m/ (meeting date)";

    private final String prefix;
    private final String value;

    public FilterCommand(String prefix, String value) {
        this.prefix = prefix.toLowerCase();
        this.value = value.toLowerCase();
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        Predicate<Person> filterPredicate = person -> {
            switch (prefix) {
                case "d": return person.getDiet().equalsIgnoreCase(value);
                case "g": return person.getGender().equalsIgnoreCase(value);
                case "p": return person.getPriority().equalsIgnoreCase(value);
                case "a": return person.getFoodAllergies().contains(value);
                case "m": return person.getMeetingDate().toString().equals(value);
                default: return false;
            }
        };

        model.updateFilteredPersonList(filterPredicate);

        return new CommandResult("Filtered patients by " + prefix + ": " + value);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof FilterCommand)) {
            return false;
        }

        FilterCommand otherFilterCommand = (FilterCommand) other;
        return prefix.equals(otherFilterCommand.prefix) && value.equals(otherFilterCommand.value);
    }
}
