package seedu.address.logic.parser;

import seedu.address.logic.commands.FilterCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new FilterCommand object.
 */
public class FilterCommandParser implements Parser<FilterCommand> {
    public static final String MESSAGE_INVALID_FORMAT =
            "Invalid filter format!\nUsage: filter [prefix]/[value]\n"
                    + "Valid prefixes: d/DIET, g/GENDER, pr/PRIORITY, m/MEETING DATE";

    @Override
    public FilterCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();

        if (trimmedArgs.isEmpty()) {
            throw new ParseException(MESSAGE_INVALID_FORMAT);
        }

        String[] parts = trimmedArgs.split("/", 2);
        if (parts.length < 2 || parts[0].isBlank() || parts[1].isBlank()) {
            throw new ParseException(MESSAGE_INVALID_FORMAT);
        }

        String prefix = parts[0].trim().toLowerCase();
        String value = parts[1].trim().toLowerCase();

        if (!prefix.matches("d|g|pr|m")) {
            throw new ParseException(MESSAGE_INVALID_FORMAT);
        }

        switch (prefix) {
        case "d":
            if (!value.matches("regular|low sodium|low fat|low carb|low sugar|none")) {
                throw new ParseException(MESSAGE_INVALID_FORMAT);
            }
            break;
        case "g":
            if (!value.matches("m|f")) {
                throw new ParseException(MESSAGE_INVALID_FORMAT);
            }
            break;
        case "pr":
            if (!value.matches("low|medium|high")) {
                throw new ParseException(MESSAGE_INVALID_FORMAT);
            }
            break;
        case "m":
            if (!value.matches("\\d{4}-\\d{2}-\\d{2}")) {
                throw new ParseException(MESSAGE_INVALID_FORMAT);
            }
            break;
        default:
            throw new ParseException(MESSAGE_INVALID_FORMAT);
        }

        return new FilterCommand(prefix, value);
    }
}
