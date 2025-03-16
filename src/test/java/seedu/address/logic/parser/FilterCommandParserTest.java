package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.FilterCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class FilterCommandParserTest {
    private final FilterCommandParser parser = new FilterCommandParser();

    // Valid test cases
    @Test
    public void parse_validDietInput_success() throws ParseException {
        FilterCommand command = parser.parse("d/low sodium");
        assertEquals(new FilterCommand("d", "low sodium"), command);
    }

    @Test
    public void parse_validGenderInput_success() throws ParseException {
        FilterCommand command = parser.parse("g/f");
        assertEquals(new FilterCommand("g", "f"), command);
    }

    @Test
    public void parse_validPriorityInput_success() throws ParseException {
        FilterCommand command = parser.parse("pr/high");
        assertEquals(new FilterCommand("pr", "high"), command);
    }

    @Test
    public void parse_validMeetingDateInput_success() throws ParseException {
        FilterCommand command = parser.parse("m/2025-03-20");
        assertEquals(new FilterCommand("m", "2025-03-20"), command);
    }

    // Invalid test cases (newly added)
    @Test
    public void parse_invalidDietValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("d/extreme keto"));
        assertThrows(ParseException.class, () -> parser.parse("d/keto"));
        assertThrows(ParseException.class, () -> parser.parse("d/vegan"));
    }

    @Test
    public void parse_invalidGenderValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("g/other"));
        assertThrows(ParseException.class, () -> parser.parse("g/male"));
        assertThrows(ParseException.class, () -> parser.parse("g/female"));
    }

    @Test
    public void parse_invalidPriorityValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("pr/urgent"));
        assertThrows(ParseException.class, () -> parser.parse("pr/none"));
        assertThrows(ParseException.class, () -> parser.parse("pr/low priority"));
    }

    @Test
    public void parse_invalidPrefix_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("x/something"));
        assertThrows(ParseException.class, () -> parser.parse("xyz/random"));
    }

    @Test
    public void parse_missingPrefix_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("low sodium"));
    }

    @Test
    public void parse_missingValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("d/"));
        assertThrows(ParseException.class, () -> parser.parse("pr/"));
        assertThrows(ParseException.class, () -> parser.parse("g/"));
    }
}
