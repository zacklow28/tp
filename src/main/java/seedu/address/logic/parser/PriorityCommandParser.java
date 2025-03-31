package seedu.address.logic.parser;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.PriorityCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Priority;

/**
 * This class parses the priority command provided in the command input.
 */
public class PriorityCommandParser implements Parser<PriorityCommand> {
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format! \n"
            + "Try pr [INDEX] [PRIORITY LEVEL]. ";

    /**
     * Parses the given {@code String} of arguments in the context of the PriorityCommand
     * and returns a PriorityCommand object for execution.
     * @throws ParseException if the user input does not conform to the expected format
     */
    public PriorityCommand parse(String args) throws ParseException {
        if (args == null || args.trim().isEmpty()) {
            throw new ParseException(MESSAGE_INVALID_COMMAND_FORMAT);
        }

        String[] tokens = args.trim().split("\\s+");

        if (tokens.length != 2) {
            throw new ParseException(MESSAGE_INVALID_COMMAND_FORMAT);
        }

        Index index;
        try {
            index = ParserUtil.parseIndex(tokens[0]);
        } catch (ParseException pe) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, PriorityCommand.MESSAGE_USAGE), pe);
        }

        String priorityValue = tokens[1].toUpperCase();

        if (!Priority.isValidPriority(priorityValue)) {
            throw new ParseException(Priority.MESSAGE_CONSTRAINTS);
        }

        Priority priority = new Priority(priorityValue);

        return new PriorityCommand(index, priority);
    }
}
