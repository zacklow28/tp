package seedu.address.logic.parser;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.PriorityCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Priority;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PRIORITY;

public class PriorityCommandParser{
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format! \n%1$s";

    /**
     * Parses the given {@code String} of arguments in the context of the PriorityCommand
     * and returns a PriorityCommand object for execution.
     * @throws ParseException if the user input does not conform to the expected format
     */
    public PriorityCommand parse(String args) throws ParseException {
        requireNonNull(args);
        ArgumentMultimap argMultimap = ArgumentTokenizer.tokenize(args, PREFIX_PRIORITY);

        Index index;
        try {
            index = ParserUtil.parseIndex(argMultimap.getPreamble());
        } catch (ParseException pe) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, PriorityCommand.MESSAGE_USAGE), pe);
        }

        String priorityValue = argMultimap.getValue(PREFIX_PRIORITY).orElseThrow(() ->
                new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, PriorityCommand.MESSAGE_USAGE))
        );

        if (!Priority.isValidPriority(priorityValue)) {
            throw new ParseException(Priority.MESSAGE_CONSTRAINTS);
        }

        Priority priority = new Priority(priorityValue);

        return new PriorityCommand(index, priority);
    }
}
