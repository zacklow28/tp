package seedu.address.ui.testutil;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import guitests.guihandles.PersonCardHandle;
import seedu.address.model.person.Person;

/**
 * A set of assertion methods useful for writing GUI tests.
 */
public class GuiTestAssert {

    /**
     * Asserts that two PersonCardHandles display the same information.
     */
    public static void assertCardEquals(PersonCardHandle expectedCard, PersonCardHandle actualCard) {
        assertEquals(expectedCard.getName(), actualCard.getName());
        assertEquals(expectedCard.getGender(), actualCard.getGender());
        assertEquals(expectedCard.getHeight(), actualCard.getHeight());
        assertEquals(expectedCard.getWeight(), actualCard.getWeight());
        assertEquals(expectedCard.getPhone(), actualCard.getPhone());
        assertEquals(expectedCard.getEmail(), actualCard.getEmail());
        assertEquals(expectedCard.getAddress(), actualCard.getAddress());
        assertEquals(expectedCard.getMeetingDate(), actualCard.getMeetingDate());
        assertEquals(expectedCard.getTags(), actualCard.getTags());
    }

    /**
     * Asserts that {@code actualCard} displays the details of {@code expectedPerson} correctly.
     */
    public static void assertCardDisplaysPerson(Person expectedPerson, PersonCardHandle actualCard) {
        // Assert basic fields
        assertEquals(expectedPerson.getName().fullName, actualCard.getName());
        assertEquals(expectedPerson.getGender().gender, actualCard.getGender());
        assertEquals(expectedPerson.getHeight().toString() + " m", actualCard.getHeight());
        assertEquals(expectedPerson.getWeight().toString() + " kg", actualCard.getWeight());
        assertEquals(expectedPerson.getPhone().value, actualCard.getPhone());
        assertEquals(expectedPerson.getEmail().value, actualCard.getEmail());
        assertEquals(expectedPerson.getAddress().value, actualCard.getAddress());
        assertEquals(expectedPerson.getMeetingDate().toString(), actualCard.getMeetingDate());

        // Construct the expected tags list:
        // 1. Priority tag
        // 2. Diet tag prefixed with "D: "
        // 3. Additional tags (sorted alphabetically)
        List<String> expectedTags = new ArrayList<>();
        expectedTags.add(expectedPerson.getPriority().toString());
        expectedTags.add("D: " + expectedPerson.getDiet().toString());
        List<String> additionalTags = expectedPerson.getAllergies().stream()
                .map(allergy -> allergy.allergyName)
                .sorted()
                .collect(Collectors.toList());
        expectedTags.addAll(additionalTags);

        assertEquals(expectedTags, actualCard.getTags());
    }
}
