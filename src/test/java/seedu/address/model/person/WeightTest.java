package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class WeightTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Weight(null));
    }

    @Test
    public void constructor_emptyString_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Weight(""));
    }

    @Test
    public void constructor_blankString_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Weight(" "));
    }

    @Test
    public void constructor_nonNumeric_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Weight("abc"));
    }

    @Test
    public void constructor_zeroValue_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Weight("0"));
    }

    @Test
    public void constructor_negativeValue_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Weight("-1"));
    }

    @Test
    public void constructor_validWeight_succeeds() {
        new Weight("55.0");
        new Weight("0.0001"); // edge case just above 0
    }

    @Test
    public void isValidWeight_invalidInputs_returnFalse() {
        assertFalse(Weight.isValidWeight(""));
        assertFalse(Weight.isValidWeight(" "));
        assertFalse(Weight.isValidWeight("abc"));
        assertFalse(Weight.isValidWeight("0"));
        assertFalse(Weight.isValidWeight("-1"));
    }

    @Test
    public void isValidWeight_validInputs_returnTrue() {
        assertTrue(Weight.isValidWeight("1.0"));
        assertTrue(Weight.isValidWeight("0.0001"));
        assertTrue(Weight.isValidWeight("72.5"));
    }

    @Test
    public void equals() {
        Weight w1 = new Weight("65.0");
        Weight w2 = new Weight("65.0");
        Weight w3 = new Weight("70.0");

        // same value -> returns true
        assertTrue(w1.equals(w2));
        // same object -> returns true
        assertTrue(w1.equals(w1));
        // different value -> returns false
        assertFalse(w1.equals(w3));
        // null -> returns false
        assertFalse(w1.equals(null));
        // different type -> returns false
        assertFalse(w1.equals("65.0"));
    }
}
