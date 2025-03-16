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
        String value = parts[1].trim().toLowerCase();

        // Validate prefix
        if (!prefix.matches("d|g|pr|m")) {
            throw new ParseException("Invalid filter category! Use:\n"
                    + "d/ (diet), g/(gender), pr/(priority), m/(meeting date)");
        }

        // Validate values based on prefix
        switch (prefix) {
        case "d":
            if (!value.matches("regular|low sodium|low fat|low carb|low sugar|none")) {
                throw new ParseException("Invalid diet value! Use: regular, low sodium, low fat, "
                        + "low carb, low sugar, none");
            }
            break;

        case "g":
            if (!value.matches("m|f")) {
                throw new ParseException("Invalid gender value! Use: m (male), f (female)");
            }
            break;

        case "pr":
            if (!value.matches("low|medium|high")) {
                throw new ParseException("Invalid priority value! Use: low, medium, high");
            }
            break;

        case "m":
            if (!value.matches("\\d{4}-\\d{2}-\\d{2}")) { // YYYY-MM-DD format
                throw new ParseException("Invalid meeting date format! Use: YYYY-MM-DD");
            }
            break;

        default:
            throw new ParseException("Invalid filter prefix: " + prefix);
        }

        return new FilterCommand(prefix, value);
    }
}

