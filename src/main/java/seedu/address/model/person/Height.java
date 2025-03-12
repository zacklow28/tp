package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's height in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidHeight(String)}
 */
public class Height {

    public static final String MESSAGE_CONSTRAINTS =
            "Height should be a number between 0.5 and 2.5 meters, and it should not be blank";

    private static final double MIN_HEIGHT = 0.5;
    private static final double MAX_HEIGHT = 2.5;

    public final double height;

    /**
     * Constructs a {@code Height}.
     *
     * @param height A valid height in meters.
     */
    public Height(String height) {
        requireNonNull(height);
        checkArgument(isValidHeight(height), MESSAGE_CONSTRAINTS);
        this.height = Double.parseDouble(height);
    }

    /**
     * Returns true if a given string is a valid height.
     */
    public static boolean isValidHeight(String test) {
        try {
            double value = Double.parseDouble(test);
            return value >= MIN_HEIGHT && value <= MAX_HEIGHT;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    @Override
    public String toString() {
        return String.format("%.2f", height); // Display height with 2 decimal places
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Height)) {
            return false;
        }

        Height otherHeight = (Height) other;
        return Double.compare(height, otherHeight.height) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(height);
    }

}
