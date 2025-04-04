package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class HeightTest {
    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Height(null));
    }

    @Test
    public void constructor_emptyString_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Height(""));
    }

    @Test
    public void constructor_blankString_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Height(" "));
    }

    @Test
    public void constructor_nonNumericString_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Height("abc"));
    }

    @Test
    public void constructor_belowMinHeight_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Height("0.49"));
    }

    @Test
    public void constructor_aboveMaxHeight_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Height("3.01"));
    }

    @Test
    public void constructor_negativeHeight_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Height("-1"));
    }

    @Test
    public void constructor_excessiveValue_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Height("10.0"));
    }

    @Test
    public void constructor_validHeights_succeed() {
        new Height("0.5");
        new Height("3.0");
        new Height("1.75");
        new Height("1.00");
        new Height("2.0");
    }

    @Test
    public void isValidHeight_invalidInputs_returnFalse() {
        assertFalse(Height.isValidHeight(""));
        assertFalse(Height.isValidHeight(" "));
        assertFalse(Height.isValidHeight("abc"));
        assertFalse(Height.isValidHeight("0.49"));
        assertFalse(Height.isValidHeight("3.01"));
    }

    @Test
    public void isValidHeight_validInputs_returnTrue() {
        assertTrue(Height.isValidHeight("0.5"));
        assertTrue(Height.isValidHeight("2.5"));
        assertTrue(Height.isValidHeight("1.75"));
        assertTrue(Height.isValidHeight("3.0"));
    }

    @Test
    public void equals() {
        Height h1 = new Height("1.75");
        Height h2 = new Height("1.75");
        Height h3 = new Height("2.0");

        // same value -> returns true
        assertTrue(h1.equals(h2));
        // same object -> returns true
        assertTrue(h1.equals(h1));
        // different value -> returns false
        assertFalse(h1.equals(h3));
        // null -> returns false
        assertFalse(h1.equals(null));
        // different typ -> returns false
        assertFalse(h1.equals("1.75"));
    }
}
