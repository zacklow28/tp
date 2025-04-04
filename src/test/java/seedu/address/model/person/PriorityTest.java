package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class PriorityTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Priority(null));
    }

    @Test
    public void constructor_emptyString_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Priority(""));
    }

    @Test
    public void constructor_whitespaceOnly_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Priority(" "));
    }

    @Test
    public void constructor_invalidWord_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Priority("urgent"));
    }

    @Test
    public void constructor_validPriority_succeeds() {
        // uppercase
        new Priority("HIGH");
        new Priority("MEDIUM");
        new Priority("LOW");

        // lowercase
        new Priority("high");
        new Priority("medium");
        new Priority("low");
    }

    @Test
    public void isValidPriority_invalidInputs_returnFalse() {
        assertFalse(Priority.isValidPriority(""));
        assertFalse(Priority.isValidPriority(" "));
        assertFalse(Priority.isValidPriority("urgent"));
        // extra space
        assertFalse(Priority.isValidPriority("high "));
    }

    @Test
    public void isValidPriority_validInputs_returnTrue() {
        assertTrue(Priority.isValidPriority("LOW"));
        assertTrue(Priority.isValidPriority("Medium"));
        // case-insensitive
        assertTrue(Priority.isValidPriority("high"));
    }

    @Test
    public void equals() {
        Priority p1 = new Priority("HIGH");
        Priority p2 = new Priority("high");
        Priority p3 = new Priority("low");

        // same value after normalization -> returns true
        assertTrue(p1.equals(p2));
        // same object -> returns true
        assertTrue(p1.equals(p1));
        // different value -> returns false
        assertFalse(p1.equals(p3));
        // null -> returns false
        assertFalse(p1.equals(null));
        // different type -> returns false
        assertFalse(p1.equals("HIGH"));
    }
}
