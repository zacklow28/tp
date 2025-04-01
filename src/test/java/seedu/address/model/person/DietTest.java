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
    public void constructor_invalidDiet_throwsIllegalArgumentException() {
        String[] invalidDiets = {
            "",             // empty string
            " ",            // whitespace
            "vegetarian",   // not in list
        };
        for (String diet : invalidDiets) {
            assertThrows(IllegalArgumentException.class, () -> new Diet(diet));
        }
    }

    @Test
    public void constructor_validDiet_succeeds() {
        String[] validDiets = {
            "regular",
            "low sodium",
            "    LOW SODIUM    ", // tests trim and lowercase
            "Low Sugar",          // tests lowercase conversion
        };
        for (String diet: validDiets) {
            // Should not throw
            new Diet(diet);
        }
    }

    @Test
    public void isValidDiet() {
        // invalid
        assertFalse(Diet.isValidDiet("")); // empty
        assertFalse(Diet.isValidDiet(" ")); // whitespace
        assertFalse(Diet.isValidDiet("mediterranean"));
        assertFalse(Diet.isValidDiet("low sodium ")); //trailing whitespace

        // valid (must match regex exactly)
        assertTrue(Diet.isValidDiet("regular"));
        assertTrue(Diet.isValidDiet("low sodium"));
        assertTrue(Diet.isValidDiet("low fat"));
        assertTrue(Diet.isValidDiet("low carb"));
        assertTrue(Diet.isValidDiet("low sugar"));
        assertTrue(Diet.isValidDiet("none"));
    }

    @Test
    public void equals() {
        Diet diet = new Diet("low fat");

        // same values -> returns true
        assertTrue(diet.equals(new Diet("LOW FAT"))); // still equal after normalization

        // same object -> returns true
        assertTrue(diet.equals(diet));

        // null -> returns false
        assertFalse(diet.equals(null));

        // different type -> retuns false
        assertFalse(diet.equals(10));

        // different values -> returns false
        assertFalse(diet.equals(new Diet("low carb")));
    }
}
