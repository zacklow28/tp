package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static seedu.address.testutil.TypicalPersons.ALICE;
import static seedu.address.testutil.TypicalPersons.BENSON;
import static seedu.address.testutil.TypicalPersons.CARL;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.person.Person;

class SortCommandTest {
    private Model model;

    @BeforeEach
    void setUp() {
        model = new ModelManager();
        model.addPerson(ALICE);
        model.addPerson(BENSON);
        model.addPerson(CARL);
    }

    @Test
    void execute_sortByPriority_correctOrder() {
        SortCommand command = new SortCommand("priority");
        command.execute(model);

        List<Person> sorted = model.getFilteredPersonList();
        assertEquals(BENSON, sorted.get(0));
        assertEquals(CARL, sorted.get(1));
        assertEquals(ALICE, sorted.get(2));
    }

    @Test
    void execute_sortByName_correctOrder() {
        SortCommand command = new SortCommand("name");
        command.execute(model);

        List<Person> sorted = model.getFilteredPersonList();
        assertEquals(ALICE, sorted.get(0));
        assertEquals(BENSON, sorted.get(1));
        assertEquals(CARL, sorted.get(2));
    }

    @Test
    void execute_sortByDiet_correctOrder() {
        SortCommand command = new SortCommand("diet");
        command.execute(model);

        List<Person> sorted = model.getFilteredPersonList();
        assertEquals(BENSON, sorted.get(0));
        assertEquals(CARL, sorted.get(1));
        assertEquals(ALICE, sorted.get(2));
    }

    @Test
    void execute_invalidSortType_throwsException() {
        SortCommand command = new SortCommand("invalid");
        assertThrows(IllegalArgumentException.class, () -> command.execute(model));
    }

    @Test
    void equals_sameSortType_returnsTrue() {
        SortCommand command1 = new SortCommand("priority");
        SortCommand command2 = new SortCommand("priority");
        assertEquals(command1, command2);
    }

    @Test
    void equals_differentSortType_returnsFalse() {
        SortCommand command1 = new SortCommand("priority");
        SortCommand command2 = new SortCommand("name");
        assertNotEquals(command1, command2);
    }

    @Test
    void equals_null_returnsFalse() {
        SortCommand command = new SortCommand("priority");
        assertNotEquals(command, null);
    }

    @Test
    void equals_differentObject_returnsFalse() {
        SortCommand command = new SortCommand("priority");
        assertNotEquals(command, new Object());
    }

    @Test
    void equals_sameObject_returnsTrue() {
        SortCommand command = new SortCommand("priority");
        assertEquals(command, command);
    }

    @Test
    public void equals_sameMeetingDateSortType_returnsTrue() {
        SortCommand sortCommand1 = new SortCommand("meetingdate");
        SortCommand sortCommand2 = new SortCommand("meetingdate");
        assertEquals(sortCommand1, sortCommand2);
    }

    @Test
    public void equals_differentSortTypes_returnsFalse() {
        SortCommand sortCommand1 = new SortCommand("meetingdate");
        SortCommand sortCommand2 = new SortCommand("priority");
        assertNotEquals(sortCommand1, sortCommand2);
    }

}
