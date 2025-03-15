package seedu.address.logic.parser;

import seedu.address.logic.commands.SortCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input and creates a new SortCommand object.
 */
public class SortCommandParser implements Parser<SortCommand> {
    @Override
    public SortCommand parse(String userInput) throws ParseException {
        String trimmedInput = userInput.trim().toLowerCase();
        String[] splitArgs = trimmedInput.split("\\s+");

        if (splitArgs.length != 2) {
            throw new ParseException("Invalid sort type. " + SortCommand.MESSAGE_USAGE);
        }

        String sortType = splitArgs[1];

        if (!(sortType.equals("priority") || sortType.equals("name") || sortType.equals("diet"))) {
            throw new ParseException("Invalid sort type. " + SortCommand.MESSAGE_USAGE);
        }

        return new SortCommand(sortType);
    }
}
