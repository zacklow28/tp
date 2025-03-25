package seedu.address.logic.commands;


import org.junit.jupiter.api.Test;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccessNoObjectComparison;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

public class RedoCommandTest {

    private final Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());

    @Test
    public void execute_redoSuccessful_returnsSuccessMessage() {
        model.deletePerson(model.getFilteredPersonList().get(0));
        model.commitAddressBook(); // Commit change to the model
        model.undoAddressBook();
        RedoCommand redoCommand = new RedoCommand();
        assertCommandSuccessNoObjectComparison(redoCommand, model, RedoCommand.MESSAGE_SUCCESS);
    }


    @Test
    public void execute_noRedoableState_throwsCommandException() {
        RedoCommand redoCommand = new RedoCommand();

        assertCommandFailure(redoCommand, model, RedoCommand.MESSAGE_FAILURE);
    }

    @Test
    public void equals_sameRedoCommand() {
        RedoCommand redoCommand1 = new RedoCommand();
        RedoCommand redoCommand2 = new RedoCommand();

        assertEquals(redoCommand1, redoCommand1);
        assertEquals(redoCommand1, redoCommand2);
    }

    @Test
    public void equals_differentObject_returnsFalse() {
        RedoCommand redoCommand = new RedoCommand();
        ClearCommand clearCommand = new ClearCommand();

        assertNotEquals(redoCommand, clearCommand);
        assertNotEquals(null, redoCommand);
    }
}
