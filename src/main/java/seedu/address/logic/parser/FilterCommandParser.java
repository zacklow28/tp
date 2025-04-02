package seedu.address.logic.parser;

import seedu.address.logic.commands.FilterCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new FilterCommand object.
 */
public class FilterCommandParser implements Parser<FilterCommand> {
    public static final String GENERAL_FORMAT_HINT = "Usage: filter [prefix]/[value]\n"
            + "Valid prefixes: d/DIET, g/GENDER, pr/PRIORITY, m/MEETING DATE";

    @Override
    public FilterCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();

        if (trimmedArgs.isEmpty()) {
            throw new ParseException("Invalid filter format! " + GENERAL_FORMAT_HINT);
        }

        String[] parts = trimmedArgs.split("/", 2);

        if (parts.length < 2 || parts[0].isBlank()) {
            throw new ParseException("Invalid filter format! " + GENERAL_FORMAT_HINT);
        }

        String prefix = parts[0].trim().toLowerCase();
        String value = parts[1].trim().toLowerCase();

        // 1. Check if prefix is valid first
        if (!prefix.matches("d|g|pr|m")) {
            throw new ParseException("Invalid filter prefix: '" + prefix + "'\n" + GENERAL_FORMAT_HINT);
        }

        // 2. If prefix is valid but value is missing, give specific message
        if (value.isEmpty()) {
            String expected = switch (prefix) {
            case "d" -> "Expected: regular, low sodium, low fat, low carb, low sugar, none";
            case "g" -> "Expected: m (male), f (female)";
            case "pr" -> "Expected: low, medium, high";
            case "m" -> "Expected format: YYYY-MM-DD";
            default -> "";
            };
            throw new ParseException("Missing value for prefix '" + prefix + "'.\n" + GENERAL_FORMAT_HINT + "\n"
                    + expected);
        }

        switch (prefix) {
        case "d":
            if (!value.matches("regular|low sodium|low fat|low carb|low sugar|none")) {
                throw new ParseException("Invalid diet value: '" + value + "'.\n"
                        + "Expected: regular, low sodium, low fat, low carb, low sugar, none");
            }
            break;

        case "g":
            if (!value.matches("m|f")) {
                throw new ParseException("Invalid gender value: '" + value + "'.\n"
                        + "Expected: m (male), f (female)");
            }
            break;

        case "pr":
            if (!value.matches("low|medium|high")) {
                throw new ParseException("Invalid priority value: '" + value + "'.\n"
                        + "Expected: low, medium, high");
            }
            break;

        case "m":
            if (!value.matches("\\d{4}-\\d{2}-\\d{2}")) {
                throw new ParseException("Invalid meeting date format: '" + value + "'.\n"
                        + "Expected format: YYYY-MM-DD");
            }
            break;

        default:
            throw new ParseException("Unexpected parsing error. Please check your input.");
        }

        return new FilterCommand(prefix, value);
    }
}
