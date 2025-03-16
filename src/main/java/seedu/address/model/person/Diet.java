package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's diet preference in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidDiet(String)}
 */
public class Diet {
    public static final String DEFAULT_DIET = "none";

    public static final String MESSAGE_CONSTRAINTS =
            "Diet must be one of the following: regular, low sodium, low fat, low carb, low sugar.";

    public static final String VALIDATION_REGEX =
            "regular|low sodium|low fat|low carb|low sugar|none";

    public final String diet;

    /**
     * Constructs a {@code Diet}.
     *  If the given diet is null or empty, it is stored as "none".
     *
     * @param diet A valid diet type.
     */
    public Diet(String diet) {
        requireNonNull(diet);
        String normalizedDiet = diet.trim().toLowerCase();
        checkArgument(isValidDiet(normalizedDiet), MESSAGE_CONSTRAINTS);
        this.diet = normalizedDiet;
    }

    /**
     * Returns true if a given string is a valid diet type.
     */
    public static boolean isValidDiet(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return diet;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Diet)) {
            return false;
        }

        Diet otherDiet = (Diet) other;
        return diet.equals(otherDiet.diet);
    }

    @Override
    public int hashCode() {
        return diet.hashCode();
    }
}
