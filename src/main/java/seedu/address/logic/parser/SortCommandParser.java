package seedu.address.logic.parser;

import seedu.address.logic.commands.SortCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input and creates a new SortCommand object.
 */
public class SortCommandParser implements Parser<SortCommand> {
    @Override
    public SortCommand parse(String userInput) throws ParseException {
        String trimmedInput = userInput.trim();

        // Ensure the command is exactly "sort"
        if (!trimmedInput.equals("sort")) {
            throw new ParseException("Command should be in the following format:\n"
                    + "sort (Sorts by priority and then, name)");
        }

        return new SortCommand();
    }

}
