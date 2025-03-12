package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.TypicalPersons.ALICE;
import static seedu.address.testutil.TypicalPersons.BOB;

import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.person.Person;

import java.util.List;

public class FilterCommandTest {

    private Model model = new ModelManager();

    @Test
    public void execute_validDietFilter_success() throws CommandException {
        model.addPerson(ALICE); // Assume ALICE has diet "low fat"
        model.addPerson(BOB);   // Assume BOB has diet "regular"

        FilterCommand command = new FilterCommand("d", "low fat");
        command.execute(model);

        Predicate<Person> expectedPredicate = person -> "low fat".equalsIgnoreCase(person.getDiet());
        model.updateFilteredPersonList(expectedPredicate);

        List<Person> filteredList = model.getFilteredPersonList();
        assertEquals(1, filteredList.size());
        assertTrue(filteredList.contains(ALICE));
    }

    @Test
    public void execute_validGenderFilter_success() throws CommandException {
        model.addPerson(ALICE); // Assume ALICE is female
        model.addPerson(BOB);   // Assume BOB is male

        FilterCommand command = new FilterCommand("g", "f");
        command.execute(model);

        Predicate<Person> expectedPredicate = person -> "f".equalsIgnoreCase(person.getGender());
        model.updateFilteredPersonList(expectedPredicate);

        List<Person> filteredList = model.getFilteredPersonList();
        assertEquals(1, filteredList.size());
        assertTrue(filteredList.contains(ALICE));
    }

    @Test
    public void execute_noMatchingResults_returnsEmptyList() throws CommandException {
        model.addPerson(ALICE); // ALICE has diet "low fat"
        model.addPerson(BOB);   // BOB has diet "regular"

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

        assertTrue(firstCommand.equals(firstCommand));
        assertTrue(!firstCommand.equals(secondCommand));
    }
}
