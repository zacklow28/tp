package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.person.Person;

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
        // Execute SortCommand
        SortCommand sortCommand = new SortCommand();
        CommandResult commandResult = sortCommand.execute(model);

        // Sort expectedModel manually
        expectedModel.sortFilteredPersonList(Comparator
                .comparing(Person::getPriority, Comparator.reverseOrder())
                .thenComparing(p -> p.getName().toLowerCase()));

        // Verify command result message
        assertEquals(SortCommand.MESSAGE_SUCCESS, commandResult.getFeedbackToUser());

        // Verify that the model is correctly sorted
        assertEquals(expectedModel.getFilteredPersonList(), model.getFilteredPersonList());
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