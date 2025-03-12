package seedu.address.logic.parser;

import seedu.address.logic.commands.FilterCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new FilterCommand object.
 */
public class FilterCommandParser implements Parser<FilterCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the FilterCommand
     * and returns a FilterCommand object for execution.
     *
     * @param args User input for filtering.
     * @return A FilterCommand object for execution.
     * @throws ParseException if the user input does not conform to the expected format.
     */
    public FilterCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();

        if (trimmedArgs.isEmpty()) {
            throw new ParseException("Invalid Format! Use: filter [prefix]/[value]");
        }

        String[] parts = trimmedArgs.split("/", 2);
        if (parts.length < 2 || parts[1].trim().isEmpty()) {
            throw new ParseException("Invalid Filter Format! Use: filter [prefix]/[value]");
        }

        String prefix = parts[0].trim().toLowerCase();
        String value = parts[1].trim();

        if (!prefix.matches("[dgpam]")) {  // Allowed: d, g, p, a, m
            throw new ParseException("Invalid filter category! Use:\n"
                    + "d/ (diet), g/ (gender), p/ (priority), a/ (food allergies), m/ (meeting date)");
        }

        return new FilterCommand(prefix, value);
    }
}
