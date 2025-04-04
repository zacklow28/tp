package seedu.address.logic.parser;

import seedu.address.logic.commands.SortCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input and creates a new SortCommand object.
 */
public class SortCommandParser implements Parser<SortCommand> {

    public static final String VALID_SORT_TYPES = "priority|name|diet|meetingdate";

    @Override
    public SortCommand parse(String userInput) throws ParseException {
        String trimmedInput = userInput.trim().toLowerCase();

        if (trimmedInput.startsWith("sort")) {

            if (trimmedInput.equals("sort")) {
                throw new ParseException("Sort type is missing. Usage: sort priority | sort name | sort diet "
                        + "| sort meetingdate");
            }

            if (!trimmedInput.startsWith("sort ")) {
                throw new ParseException("Invalid sort type. Use: sort priority | sort name | sort diet | "
                        + "sort meetingdate");
            }

            trimmedInput = trimmedInput.replaceFirst("sort", "").trim(); // Strip and continue
        }

        // Final trimmedInput should now be a valid sort type
        if (!(trimmedInput.equals("priority") || trimmedInput.equals("name")
                || trimmedInput.equals("diet") || trimmedInput.equals("meetingdate"))) {
            throw new ParseException("Invalid sort type. Use: sort priority | sort name | sort diet "
                    + "| sort meetingdate");
        }

        return new SortCommand(trimmedInput);
    }
}
