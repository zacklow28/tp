package seedu.address.model.allergy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class AllergyTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Allergy(null));
    }

    @Test
    public void constructor_invalidAllergyName_throwsIllegalArgumentException() {
        String invalidAllergyName = "";
        assertThrows(IllegalArgumentException.class, () -> new Allergy(invalidAllergyName));

        String onlySpaces = "   ";
        assertThrows(IllegalArgumentException.class, () -> new Allergy(onlySpaces));

        String specialChars = "peanut/tree";
        assertThrows(IllegalArgumentException.class, () -> new Allergy(specialChars));
    }

    @Test
    public void isValidAllergyName() {
        // null allergy name
        assertThrows(NullPointerException.class, () -> Allergy.isValidAllergyName(null));

        // invalid allergy names
        assertFalse(Allergy.isValidAllergyName("")); // empty string
        assertFalse(Allergy.isValidAllergyName("   ")); // spaces only
        assertFalse(Allergy.isValidAllergyName("peanut/tree")); // contains special character
        assertFalse(Allergy.isValidAllergyName("shellfish!")); // contains symbol

        // valid allergy names
        assertTrue(Allergy.isValidAllergyName("peanut"));
        assertTrue(Allergy.isValidAllergyName("tree nut"));
        assertTrue(Allergy.isValidAllergyName("milk 123"));
        assertTrue(Allergy.isValidAllergyName("egg allergy"));
    }
}

