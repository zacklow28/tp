package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

/**
 * Unit tests for SortCommand.
 */
public class SortCommandTest {
    private Model model;
    private Model expectedModel;

    @BeforeEach
    public void setUp() {
        model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
        expectedModel = new ModelManager(getTypicalAddressBook(), new UserPrefs());
    }

    @Test
    public void execute_sort_success() {
        model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
        expectedModel = new ModelManager(getTypicalAddressBook(), new UserPrefs());

        SortCommand sortCommand = new SortCommand();
        CommandResult commandResult = sortCommand.execute(model);

        // Manually sort the expected model
        expectedModel.sortFilteredPersonList((p1, p2) -> {
            int priorityComparison = p2.getPriority().getValue().ordinal() - p1.getPriority().getValue().ordinal();
            if (priorityComparison != 0) {
                return priorityComparison;
            }
            return p1.getName().toString().compareToIgnoreCase(p2.getName().toString());
        });

        // Verify correct sorting
        assertEquals(expectedModel.getFilteredPersonList(), model.getFilteredPersonList());

        // Verify command success message
        assertEquals(SortCommand.MESSAGE_SUCCESS, commandResult.getFeedbackToUser());
    }

    @Test
    public void equals_sameObject_returnsTrue() {
        SortCommand sortCommand = new SortCommand();
        assertTrue(sortCommand.equals(sortCommand));
    }

    @Test
    public void equals_differentObject_returnsFalse() {
        SortCommand sortCommand = new SortCommand();
        Object anotherObject = new Object();
        assertTrue(!sortCommand.equals(anotherObject));
    }
}
