package seedu.address.logic.commands;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Priority;

/**
 * This class is called to set the priority of the patient.
 */
public class PriorityCommand extends Command {

    public static final String COMMAND_WORD = "priority";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Indicates priority of patient "
            + "by the index number used in the last person listing. "
            + "Existing priority will be overwritten by the input.\n"
            + "Parameters: INDEX (must be a positive integer) "
            + "pr/ [PRIORITY]\n"
            + "Example: " + COMMAND_WORD + " 1 "
            + "pr/ HIGH.";

    public static final String MESSAGE_ARGUMENTS = "Index: %1$d, Priority: %2$s";

    private final Index index;
    private final Priority priority;

    /**
     * @param index of the person in the filtered person list to edit the remark
     * @param priority of the person to be updated to
     */
    public PriorityCommand(Index index, Priority priority) {
        requireAllNonNull(index, priority);

        this.index = index;
        this.priority = priority;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        throw new CommandException(
                String.format(MESSAGE_ARGUMENTS, index.getOneBased(), priority.toString()));
    }


}
