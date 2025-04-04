package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.PriorityCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Priority;

public class PriorityCommandParserTest {

    private final PriorityCommandParser parser = new PriorityCommandParser();

    @Test
    public void parse_validArgs_returnsPriorityCommand() throws Exception {
        PriorityCommand expectedCommand =
                new PriorityCommand(Index.fromOneBased(1), new Priority("HIGH"));
        PriorityCommand result = parser.parse("1 pr/HIGH");

        assertEquals(expectedCommand, result);
    }

    @Test
    public void parse_validArgs_caseInsensitivePriority() throws Exception {
        PriorityCommand expectedCommand =
                new PriorityCommand(Index.fromOneBased(2), new Priority("MEDIUM"));
        PriorityCommand result = parser.parse("2 pr/medium");

        assertEquals(expectedCommand, result);
    }

    @Test
    public void parse_missingArgs_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse(""));
        assertThrows(ParseException.class, () -> parser.parse("   "));
    }

    @Test
    public void parse_tooManyArgs_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("1 pr/HIGH extra"));
    }

    @Test
    public void parse_invalidIndex_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("abc pr/LOW"));
        assertThrows(ParseException.class, () -> parser.parse("-1 pr/HIGH"));
    }

    @Test
    public void parse_invalidPriority_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("1 pr/urgent"));
        assertThrows(ParseException.class, () -> parser.parse("2 pr/highh"));
    }

    @Test
    public void parse_missingPrefix_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("1 HIGH")); // missing pr/
    }

    @Test
    public void parse_wrongPrefix_throwsParseException() {
        assertThrows(ParseException.class, () -> parser.parse("1 p/HIGH")); // incorrect prefix
    }
}
