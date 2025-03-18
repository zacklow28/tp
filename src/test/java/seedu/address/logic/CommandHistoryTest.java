package seedu.address.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommandHistoryTest {

    private CommandHistory commandHistory;

    @BeforeEach
    void setUp() {
        commandHistory = new CommandHistory();
    }

    @Test
    void addCommand_success() {
        commandHistory.addCommand("list");
        List<String> history = commandHistory.getCommandHistory();
        assertEquals(1, history.size());
        assertEquals("list", history.get(0));

        commandHistory.addCommand("find John");
        assertEquals(2, history.size());
        assertEquals("find John", history.get(1));
    }

    @Test
    void getPreviousCommand_success() {
        commandHistory.addCommand("list");
        commandHistory.addCommand("find John");

        assertEquals("find John", commandHistory.getPreviousCommand());
    }

    @Test
    void getPreviousCommand_returnsNullWhenNoPreviousCommandExists() {
        assertNull(commandHistory.getPreviousCommand());
    }

    @Test
    void getNextCommand_returnsCorrectCommand() {
        commandHistory.addCommand("list");
        commandHistory.addCommand("find John");

        commandHistory.getPreviousCommand();
        commandHistory.getPreviousCommand();
        assertEquals("find John", commandHistory.getNextCommand());
    }

    @Test
    void getNextCommand_returnsNullWhenNoNextCommandExists() {
        commandHistory.addCommand("list");

        assertNull(commandHistory.getNextCommand());
    }

    @Test
    void getCurrentIndex_updatesCorrectly() {
        assertEquals(-1, commandHistory.getCurrentIndex()); // Initial index

        commandHistory.addCommand("list");
        assertEquals(1, commandHistory.getCurrentIndex()); // Index set to size

        commandHistory.addCommand("find John");
        assertEquals(2, commandHistory.getCurrentIndex());
    }

    @Test
    void getCommandHistory_reflectsCommandsAdded() {
        assertTrue(commandHistory.getCommandHistory().isEmpty()); // Initially empty

        commandHistory.addCommand("list");
        List<String> history = commandHistory.getCommandHistory();
        assertEquals(1, history.size());
        assertEquals("list", history.get(0));

        commandHistory.addCommand("find John");
        assertEquals(2, history.size());
        assertEquals("find John", history.get(1));
    }
}
