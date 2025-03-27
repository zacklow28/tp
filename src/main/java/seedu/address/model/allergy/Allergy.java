package seedu.address.model.allergy;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents an Allergy in the address book.
 * Guarantees: immutable; name is valid as declared in {@link #isValidAllergyName(String)}
 */
public class Allergy {

    public static final String MESSAGE_CONSTRAINTS = "Allergy names should be alphanumeric";
    public static final String VALIDATION_REGEX = "\\p{Alnum}+";

    public final String allergyName;

    /**
     * Constructs a {@code Allergy}.
     *
     * @param allergyName A valid allergy name.
     */
    public Allergy(String allergyName) {
        requireNonNull(allergyName);
        String trimmedAllergyName = allergyName.trim();
        checkArgument(isValidAllergyName(trimmedAllergyName), MESSAGE_CONSTRAINTS);
        this.allergyName = trimmedAllergyName;
    }

    /**
     * Returns true if a given string is a valid tag name.
     */
    public static boolean isValidAllergyName(String test) {
        System.out.println("Validating allergy: '" + test + "'");
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Allergy)) {
            return false;
        }

        Allergy otherTag = (Allergy) other;
        return allergyName.equals(otherTag.allergyName);
    }

    @Override
    public int hashCode() {
        return allergyName.hashCode();
    }

    /**
     * Format state as text for viewing.
     */
    public String toString() {
        return '[' + allergyName + ']';
    }

}
