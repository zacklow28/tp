package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.allergy.Allergy;
import seedu.address.model.person.Address;
import seedu.address.model.person.Diet;
import seedu.address.model.person.Email;
import seedu.address.model.person.Gender;
import seedu.address.model.person.Height;
import seedu.address.model.person.MeetingDate;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Priority;
import seedu.address.model.person.Remark;
import seedu.address.model.person.Weight;

class SortCommandTest {
    private Model model;
    private List<Person> persons;

    @BeforeEach
    void setUp() {
        model = new ModelManager();

        persons = new ArrayList<>(Arrays.asList(
                new Person(new Name("John Doe"),
                        new Gender("m"),
                        new Height("1.7"),
                        new Weight("70"),
                        new Phone("98765432"),
                        new Email("johnd@example.com"),
                        new Address("100 Clementi"),
                        new Diet("low sodium"),
                        new Priority("low"),
                        new MeetingDate("2025-02-10"),
                        new Remark("diabetic"),
                        Set.of(new Allergy("mushroom"))),

                new Person(new Name("Alice Tan"),
                        new Gender("f"),
                        new Height("1.6"),
                        new Weight("55"),
                        new Phone("91234567"),
                        new Email("alice@example.com"),
                        new Address("Blk 123 Jurong West"),
                        new Diet("low carb"),
                        new Priority("high"),
                        new MeetingDate("2025-02-10"),
                        new Remark("diabetic"),
                        Set.of(new Allergy("mushroom"))),

                new Person(new Name("Bob Lim"),
                        new Gender("m"),
                        new Height("1.8"),
                        new Weight("80"),
                        new Phone("87654321"),
                        new Email("bob@example.com"),
                        new Address("456 Orchard Road"),
                        new Diet("low sugar"),
                        new Priority("medium"),
                        new MeetingDate("2025-03-05"),
                        new Remark("hypertension"),
                        Set.of(new Allergy("prawn")))
        ));

        // Add persons to the model
        for (Person p : persons) {
            model.addPerson(p);
        }
    }

    @Test
    void execute_sortByPriority_correctOrder() {
        SortCommand command = new SortCommand("priority");
        command.execute(model);

        assertEquals("Alice Tan", model.getFilteredPersonList().get(0).getName().toString());
        assertEquals("Bob Lim", model.getFilteredPersonList().get(1).getName().toString());
        assertEquals("John Doe", model.getFilteredPersonList().get(2).getName().toString());
    }

    @Test
    void execute_sortByName_correctOrder() {
        SortCommand command = new SortCommand("name");
        command.execute(model);

        persons.sort(Comparator.comparing(p -> p.getName().toString().toLowerCase()));

        assertEquals("Alice Tan", persons.get(0).getName().toString());
        assertEquals("Bob Lim", persons.get(1).getName().toString());
        assertEquals("John Doe", persons.get(2).getName().toString());
    }

    @Test
    void execute_sortByDiet_correctOrder() {
        SortCommand command = new SortCommand("diet");
        command.execute(model);

        assertEquals("Alice Tan", model.getFilteredPersonList().get(0).getName().toString());
        assertEquals("John Doe", model.getFilteredPersonList().get(1).getName().toString());
        assertEquals("Bob Lim", model.getFilteredPersonList().get(2).getName().toString());
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
}
