package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's weight in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidWeight(String)}
 */
public class Weight {

    public static final String MESSAGE_CONSTRAINTS =
            "Weight should be a positive number greater than 0, and it should not be blank";

    private static final double MIN_WEIGHT = 0.0;

    private final double weight;

    /**
     * Constructs a {@code Weight}.
     *
     * @param weight A valid weight in kilograms.
     */
    public Weight(String weight) {
        requireNonNull(weight);
        checkArgument(isValidWeight(weight), MESSAGE_CONSTRAINTS);
        this.weight = Double.parseDouble(weight);
    }

    /**
     * Returns true if a given string is a valid weight.
     */
    public static boolean isValidWeight(String test) {
        try {
            double value = Double.parseDouble(test);
            return value > MIN_WEIGHT;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%.2f", weight); // Display with 2 decimal places + unit
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Weight)) {
            return false;
        }

        Weight otherWeight = (Weight) other;
        return Double.compare(weight, otherWeight.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(weight);
    }
}