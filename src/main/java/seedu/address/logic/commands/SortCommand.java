package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.Model;

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
            int priorityComparison = p2.getPriority().getValue().ordinal() - p1.getPriority().getValue().ordinal();
            if (priorityComparison != 0) {
                return priorityComparison;
            }
            return p1.getName().toString().compareToIgnoreCase(p2.getName().toString());
        });


        return new CommandResult(MESSAGE_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof SortCommand;
    }
}
