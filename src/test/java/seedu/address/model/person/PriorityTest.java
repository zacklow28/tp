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
    public void constructor_validPriority_uppercase_succeeds() {
        new Priority("HIGH");
        new Priority("MEDIUM");
        new Priority("LOW");
    }

    @Test
    public void constructor_validPriority_lowercase_succeeds() {
        new Priority("high");
        new Priority("medium");
        new Priority("low");
    }

    @Test
    public void isValidPriority_invalidInputs_returnFalse() {
        assertFalse(Priority.isValidPriority(""));
        assertFalse(Priority.isValidPriority(" "));
        assertFalse(Priority.isValidPriority("urgent"));
        assertFalse(Priority.isValidPriority("high ")); // extra space
    }

    @Test
    public void isValidPriority_validInputs_returnTrue() {
        assertTrue(Priority.isValidPriority("LOW"));
        assertTrue(Priority.isValidPriority("Medium"));
        assertTrue(Priority.isValidPriority("high")); // case-insensitive
    }

    @Test
    public void equals() {
        Priority p1 = new Priority("HIGH");
        Priority p2 = new Priority("high");
        Priority p3 = new Priority("low");

        assertTrue(p1.equals(p2));       // same value after normalization
        assertTrue(p1.equals(p1));       // same object
        assertFalse(p1.equals(p3));      // different value
        assertFalse(p1.equals(null));    // null
        assertFalse(p1.equals("HIGH"));  // different type
    }
}
