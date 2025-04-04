package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.FilterCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class FilterCommandParserTest {

    private final FilterCommandParser parser = new FilterCommandParser();

    @Test
    public void parse_diet_success() throws ParseException {
        FilterCommand command = parser.parse("d/low sodium");
        assertEquals(new FilterCommand("d", "low sodium"), command);
    }

    @Test
    public void parse_gender_success() throws ParseException {
        FilterCommand command = parser.parse("g/f");
        assertEquals(new FilterCommand("g", "f"), command);
    }

    @Test
    public void parse_priority_success() throws ParseException {
        FilterCommand command = parser.parse("pr/high");
        assertEquals(new FilterCommand("pr", "high"), command);
    }

    @Test
    public void parse_date_success() throws ParseException {
        FilterCommand command = parser.parse("m/2025-03-20");
        assertEquals(new FilterCommand("m", "2025-03-20"), command);
    }

    @Test
    public void parse_invalidPrefix_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("x/something"));
    }

    @Test
    public void parse_missingPrefix_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("low sodium"));
    }

    @Test
    public void parse_missingDietValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("d/"));
    }

    @Test
    public void parse_missingGenderValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("g/"));
    }

    @Test
    public void parse_missingPriorityValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("pr/"));
    }

    @Test
    public void parse_missingMeetingDateValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("m/"));
    }

    @Test
    public void parse_invalidDietValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("d/high protein"));
    }

    @Test
    public void parse_invalidGenderValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("g/x"));
    }

    @Test
    public void parse_invalidPriorityValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("pr/extreme"));
    }

    @Test
    public void parse_invalidMeetingDateFormat_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("m/16-03-2025"));
    }
}
