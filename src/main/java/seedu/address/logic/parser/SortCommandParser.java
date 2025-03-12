package seedu.address.logic.parser;

import seedu.address.logic.commands.SortCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input and creates a new SortCommand object.
 */
public class SortCommandParser implements Parser<SortCommand> {
    @Override
    public SortCommand parse(String userInput) throws ParseException {
        if (!userInput.trim().isEmpty()) {
            throw new ParseException("Sort command should not have additional arguments. Just use: sort");
        }
        return new SortCommand();
    }
}
