package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class DietTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Diet(null));
    }

    @Test
    public void constructor_emptyString_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Diet(""));
    }

    @Test
    public void constructor_whitespaceOnly_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Diet(" "));
    }

    @Test
    public void constructor_invalidWord_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Diet("vegetarian"));
    }

    @Test
    public void constructor_validDiet_succeeds() {
        new Diet("regular");
        new Diet("    LOW SODIUM   ");
        new Diet("Low Sugar");

    }

    @Test
    public void isValidDiet_invalidEmpty_returnFalse() {
        assertFalse(Diet.isValidDiet(""));
    }

    @Test
    public void isValidDiet_invalidWhitespace_returnFalse() {
        assertFalse(Diet.isValidDiet(" "));
    }

    @Test
    public void isValidDiet_invalidUnknownWord_returnFalse() {
        assertFalse(Diet.isValidDiet("mediterranean"));
    }

    @Test
    public void isValidDiet_invalidTrailingSpace_returnFalse() {
        assertFalse(Diet.isValidDiet("low sodium "));
    }

    @Test
    public void isValidDiet_validOptions_returnTrue() {
        assertTrue(Diet.isValidDiet("regular"));
        assertTrue(Diet.isValidDiet("low sodium"));
        assertTrue(Diet.isValidDiet("low fat"));
        assertTrue(Diet.isValidDiet("low carb"));
        assertTrue(Diet.isValidDiet("low sugar"));
    }

    @Test
    public void equals() {
        Diet diet = new Diet("low fat");

        // same value after normalization -> returns true
        assertTrue(diet.equals(new Diet("LOW FAT")));

        // same object -> returns true
        assertTrue(diet.equals(diet));

        // null -> returns false
        assertFalse(diet.equals(null));

        // different type -> returns false
        assertFalse(diet.equals(10));

        // different value -> returns false
        assertFalse(diet.equals(new Diet("low carb")));
    }
}
