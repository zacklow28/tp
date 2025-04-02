package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.person.Person;
import seedu.address.model.person.Priority;
import seedu.address.testutil.TypicalPersons;

public class PriorityCommandTest {

    private final Model model = new ModelManager(TypicalPersons.getTypicalAddressBook(), new UserPrefs());

    @Test
    public void execute_validIndex_successfulPriorityUpdate() throws Exception {
        Index index = Index.fromZeroBased(0);
        Person person = model.getFilteredPersonList().get(index.getZeroBased());
        Priority newPriority = new Priority("HIGH");

        PriorityCommand command = new PriorityCommand(index, newPriority);
        CommandResult result = command.execute(model);

        assertEquals(String.format("Updated priority for %s to %s", person.getName(), "HIGH"),
                result.getFeedbackToUser());
        assertEquals(newPriority, model.getFilteredPersonList().get(index.getZeroBased()).getPriority());
    }

    @Test
    public void execute_invalidIndex_throwsCommandException() {
        Index outOfBoundIndex = Index.fromZeroBased(model.getFilteredPersonList().size());
        PriorityCommand command = new PriorityCommand(outOfBoundIndex, new Priority("LOW"));

        assertThrows(CommandException.class, () -> command.execute(model));
    }

    @Test
    public void constructor_nullArguments_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new PriorityCommand(null, new Priority("MEDIUM")));
        assertThrows(NullPointerException.class, () -> new PriorityCommand(Index.fromZeroBased(0), null));
    }

    @Test
    public void equals() {
        PriorityCommand command1 = new PriorityCommand(Index.fromZeroBased(0), new Priority("HIGH"));
        PriorityCommand command2 = new PriorityCommand(Index.fromZeroBased(0), new Priority("HIGH"));
        PriorityCommand command3 = new PriorityCommand(Index.fromZeroBased(1), new Priority("LOW"));

        // same object
        assertTrue(command1.equals(command1));

        // same values
        assertTrue(command1.equals(command2));

        // different index and priority
        assertFalse(command1.equals(command3));

        // null
        assertFalse(command1.equals(null));

        // different type
        assertFalse(command1.equals(new ClearCommand()));
    }


    @Test
    public void hashCode_consistentWithEquals() {
        PriorityCommand command1 = new PriorityCommand(Index.fromZeroBased(1), new Priority("LOW"));
        PriorityCommand command2 = new PriorityCommand(Index.fromZeroBased(1), new Priority("LOW"));

        assertEquals(command1, command2);
        assertEquals(command1.hashCode(), command2.hashCode());
    }
}
