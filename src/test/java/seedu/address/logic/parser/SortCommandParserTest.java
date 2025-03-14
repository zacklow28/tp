package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.SortCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Unit tests for SortCommandParser.
 */
public class SortCommandParserTest {
    private final SortCommandParser parser = new SortCommandParser();

    @Test
    public void parse_validSortCommand_success() throws ParseException {
        SortCommand command = parser.parse("sort");
        assertEquals(new SortCommand(), command);
    }

    @Test
    public void parse_invalidSortCommand_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("sort pr"));
        assertThrows(ParseException.class, () -> parser.parse("sort n"));
        assertThrows(ParseException.class, () -> parser.parse("sort priority"));
        assertThrows(ParseException.class, () -> parser.parse("sort name"));
        assertThrows(ParseException.class, () -> parser.parse("sort something"));
    }
}
