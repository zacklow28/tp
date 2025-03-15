package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.FilterCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class FilterCommandParserTest {
    private final FilterCommandParser parser = new FilterCommandParser();

    @Test
    public void parse_validInput_success() throws ParseException {
        FilterCommand command = parser.parse("d/low fat");
        assertEquals(new FilterCommand("d", "low fat"), command);
    }

    @Test
    public void parse_validGenderInput_success() throws ParseException {
        FilterCommand command = parser.parse("g/f");
        assertEquals(new FilterCommand("g", "f"), command);
    }

    @Test
    public void parse_validPriorityInput_success() throws ParseException {
        FilterCommand command = parser.parse("pr/h");
        assertEquals(new FilterCommand("pr", "h"), command);
    }

    @Test
    public void parse_missingPrefix_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("low fat"));
    }

    @Test
    public void parse_missingValue_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("d/"));
    }

    @Test
    public void parse_invalidPrefix_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("x/something"));
    }
}

