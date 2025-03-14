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
    public static final String MESSAGE_SUCCESS = "Sorted patient list by priority and then, name.";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);

        model.sortFilteredPersonList((p1, p2) -> {
            int priorityComparison = p2.getPriority().compareToIgnoreCase(p1.getPriority());
            if (priorityComparison != 0) {
                return priorityComparison;
            }
            return p1.getName().toString().compareToIgnoreCase(p2.getName().toString());
        });

        return new CommandResult(MESSAGE_SUCCESS);
    }
}
