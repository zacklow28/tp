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
    public void constructor_emptyString_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Gender(""));
    }

    @Test
    public void constructor_whitespaceOnly_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Gender(" "));
    }

    @Test
    public void constructor_invalidCharacter_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Gender("X"));
    }

    @Test
    public void constructor_invalidWord_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Gender("male"));
    }

    @Test
    public void constructor_validGender_succeeds() {
        // uppercase
        new Gender("M");
        new Gender("F");

        // lowercase
        new Gender("m");
        new Gender("f");

        // trailing whitespaces
        new Gender(" m ");
        new Gender(" f");
        new Gender("m ");
    }

    @Test
    public void isValidGender_invalidInputs_returnFalse() {
        assertFalse(Gender.isValidGender(""));
        assertFalse(Gender.isValidGender("male"));
        // not trimmed inside isValidGender
        assertFalse(Gender.isValidGender(" m "));
    }

    @Test
    public void isValidGender_validInputs_returnTrue() {
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

        // same object -> returns true
        assertTrue(g1.equals(g1));
        // same normalized value -> returns true
        assertTrue(g1.equals(g2));
        // different value -> returns false
        assertFalse(g1.equals(g3));
        // null -> returns false
        assertFalse(g1.equals(null));
        // different type -> returns false
        assertFalse(g1.equals("f"));
    }
}
