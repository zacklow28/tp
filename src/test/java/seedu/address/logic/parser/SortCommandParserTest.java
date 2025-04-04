package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.SortCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class SortCommandParserTest {
    private final SortCommandParser parser = new SortCommandParser();

    @Test
    public void parse_validArgs_returnsSortCommand() throws Exception {
        assertEquals(new SortCommand("priority"), parser.parse("sort priority"));
        assertEquals(new SortCommand("name"), parser.parse("sort name"));
        assertEquals(new SortCommand("diet"), parser.parse("sort diet"));
        assertEquals(new SortCommand("meetingdate"), parser.parse("sort meetingdate"));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("sort"));
        assertThrows(ParseException.class, () -> parser.parse("sort xyz"));
        //assertThrows(ParseException.class, () -> parser.parse("sortpriority"));
        assertThrows(ParseException.class, () -> parser.parse("sort 123"));
    }

    @Test
    public void parse_extraWhitespace_stillParsesCorrectly() throws Exception {
        assertEquals(new SortCommand("priority"), parser.parse(" sort   priority   "));
        assertEquals(new SortCommand("name"), parser.parse(" sort  name  "));
        assertEquals(new SortCommand("diet"), parser.parse("   sort diet   "));
        assertEquals(new SortCommand("meetingdate"), parser.parse("   sort   meetingdate   "));
    }

    @Test
    public void parse_meetingDateKeywordOnly_success() throws Exception {
        assertEquals(new SortCommand("meetingdate"), parser.parse("meetingdate"));
    }

    @Test
    public void parse_invalidStandaloneValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("invalid"));
    }
}
