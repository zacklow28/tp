package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class GenderTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Gender(null));
    }

    @Test
    public void constructor_invalidGender_throwsIllegalArgumentException() {
        String[] invalidGenders = {
            "",     // empty
            " ",    // whitespace
            "X",    // not M or F
            "male", // invalid full word
        };
        for (String gender : invalidGenders) {
            assertThrows(IllegalArgumentException.class, () -> new Gender(gender));
        }
    }

    @Test
    public void constructor_validGender_succeeds() {
        String[] validGenders = {
            "M", "F",   // uppercase
            "m", "f",   // lowercase
            " m ", " f", "m " // whitespaces
        };
        for (String gender : validGenders) {
            new Gender(gender); //should not throw
        }
    }

    @Test
    public void isValidGender() {
        // invalid
        assertFalse(Gender.isValidGender(""));
        assertFalse(Gender.isValidGender("male"));
        assertFalse(Gender.isValidGender(" m ")); // trailing space not trimmed

        // valid
        assertTrue(Gender.isValidGender("F"));
        assertTrue(Gender.isValidGender("f"));
        assertTrue(Gender.isValidGender("M"));
        assertTrue(Gender.isValidGender("m"));
    }

    @Test
    public void equals() {
        Gender g1 = new Gender("F");
        Gender g2 = new Gender("f");
        Gender g3 = new Gender("M");

        assertTrue(g1.equals(g1));      // same object -> returns true
        assertTrue(g1.equals(g2));      // same normalized value -> returns true
        assertFalse(g1.equals(g3));     // different values -> returns false
        assertFalse(g1.equals(null));   // null -> returns false
        assertFalse(g1.equals("f"));    // different type -> returns false
    }
}
