package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccessNoObjectComparison;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

public class UndoCommandTest {

    private final Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());

    @Test
    public void execute_undoSuccessful_returnsSuccessMessage() {
        model.deletePerson(model.getFilteredPersonList().get(0));
        model.commitAddressBook(); // Commit change to the model

        UndoCommand undoCommand = new UndoCommand();
        assertCommandSuccessNoObjectComparison(undoCommand, model, UndoCommand.MESSAGE_SUCCESS);
    }


    @Test
    public void execute_noUndoableState_throwsCommandException() {
        UndoCommand undoCommand = new UndoCommand();

        assertCommandFailure(undoCommand, model, UndoCommand.MESSAGE_FAILURE);
    }

    @Test
    public void equals_sameUndoCommand() {
        UndoCommand undoCommand1 = new UndoCommand();
        UndoCommand undoCommand2 = new UndoCommand();

        assertEquals(undoCommand1, undoCommand1);
        assertEquals(undoCommand1, undoCommand2);
    }

    @Test
    public void equals_differentObject_returnsFalse() {
        UndoCommand undoCommand = new UndoCommand();
        ClearCommand clearCommand = new ClearCommand();

        assertNotEquals(undoCommand, clearCommand);
        assertNotEquals(null, undoCommand);
    }
}
