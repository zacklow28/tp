package seedu.address.ui;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.ui.testutil.GuiTestAssert.assertCardDisplaysPerson;

import org.junit.jupiter.api.Test;

import guitests.guihandles.PersonCardHandle;
import seedu.address.model.person.Person;
import seedu.address.testutil.PersonBuilder;

public class PersonCardTest extends GuiUnitTest {

    @Test
    public void display() {
        // no tags, basic fields
        Person personWithNoTags = new PersonBuilder()
                .withGender("F")
                .withHeight("1.65")
                .withWeight("55")
                .withPhone("99999999")
                .withEmail("gag@g.com")
                .withAddress("100 Clementi")
                .withDiet("regular")
                .withPriority("High")
                .withMeetingDate("2025-03-21")
                .withTags()
                .build();
        PersonCard personCard = new PersonCard(personWithNoTags, 1); // 👈 pass index
        uiPartExtension.setUiPart(personCard);
        assertCardDisplay(personCard, personWithNoTags);

        // with tags and all fields
        Person personWithTags = new PersonBuilder()
                .withGender("M")
                .withHeight("1.80")
                .withWeight("75")
                .withPhone("99999999")
                .withEmail("gag@g.com")
                .withAddress("100 Clementi")
                .withDiet("low sodium")
                .withPriority("Medium")
                .withMeetingDate("2025-03-22")
                .withTags("Diabetic", "Asthma")
                .build();
        personCard = new PersonCard(personWithTags, 2); // 👈 pass index
        uiPartExtension.setUiPart(personCard);
        assertCardDisplay(personCard, personWithTags);
    }

    @Test
    public void equals() {
        Person person = new PersonBuilder().build();
        PersonCard personCard = new PersonCard(person, 1);

        // same person, same index -> true
        PersonCard copy = new PersonCard(person, 1);
        assertTrue(personCard.equals(copy));

        // same object -> true
        assertTrue(personCard.equals(personCard));

        // null -> false
        assertFalse(personCard.equals(null));

        // different types -> false
        assertFalse(personCard.equals(0));

        // different person -> false
        Person differentPerson = new PersonBuilder().withName("different").build();
        assertFalse(personCard.equals(new PersonCard(differentPerson, 1)));

        // same person, different index -> false (if equality includes index in future)
        // assertFalse(personCard.equals(new PersonCard(person, 2))); // optional
    }

    /**
     * Asserts that {@code personCard} displays the details of {@code expectedPerson} correctly.
     */
    private void assertCardDisplay(PersonCard personCard, Person expectedPerson) {
        PersonCardHandle handle = new PersonCardHandle(personCard.getRoot());
        assertCardDisplaysPerson(expectedPerson, handle);
    }
}
