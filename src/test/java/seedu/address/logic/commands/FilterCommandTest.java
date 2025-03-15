package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.TypicalPersons.ALICE;
import static seedu.address.testutil.TypicalPersons.BOB;
import static seedu.address.testutil.TypicalPersons.ELLE;
import static seedu.address.testutil.TypicalPersons.FIONA;

import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.person.Person;

public class FilterCommandTest {

    private final Model model = new ModelManager();

    @Test
    public void execute_validDietFilter_success() throws CommandException {
        model.addPerson(ALICE);
        model.addPerson(FIONA);
        model.addPerson(ELLE); // Elle also has "low sodium"

        FilterCommand command = new FilterCommand("d", "low sodium");
        command.execute(model);

        List<Person> filteredList = model.getFilteredPersonList();

        // Debugging output
        System.out.println("Filtered List: " + filteredList);

        assertEquals(2, filteredList.size());
        assertTrue(filteredList.contains(ALICE));
        assertTrue(filteredList.contains(ELLE));
    }

    @Test
    public void execute_validGenderFilter_success() throws CommandException {
        model.addPerson(ALICE);
        model.addPerson(BOB);

        FilterCommand command = new FilterCommand("g", "f");
        command.execute(model);

        Predicate<Person> expectedPredicate = person -> person.getGender().toString().equalsIgnoreCase("f");
        model.updateFilteredPersonList(expectedPredicate);

        List<Person> filteredList = model.getFilteredPersonList();
        assertEquals(1, filteredList.size());
        assertTrue(filteredList.contains(ALICE));
    }

    @Test
    public void execute_noMatchingResults_returnsEmptyList() throws CommandException {
        model.addPerson(ALICE);
        model.addPerson(BOB);

        FilterCommand command = new FilterCommand("d", "high protein");
        command.execute(model);

        List<Person> filteredList = model.getFilteredPersonList();
        assertEquals(0, filteredList.size());
    }

    @Test
    public void execute_invalidFilterPrefix_throwsException() {
        FilterCommand command = new FilterCommand("x", "something");
        assertThrows(CommandException.class, () -> command.execute(model));
    }

    @Test
    public void equals() {
        FilterCommand firstCommand = new FilterCommand("d", "low fat");
        FilterCommand secondCommand = new FilterCommand("d", "regular");

        assertEquals(firstCommand, firstCommand);
        assertNotEquals(firstCommand, secondCommand);
    }
}
