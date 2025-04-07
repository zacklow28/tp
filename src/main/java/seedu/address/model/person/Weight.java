package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's weight in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidWeight(String)}
 */
public class Weight {

    public static final String MESSAGE_CONSTRAINTS =
        "Weight in kilograms must be a positive number strictly greater than 0.00 and less than or equal to 1000.00."
        + "\nIt must be specified with 2 decimal places and should not be blank.";

    private static final double MIN_WEIGHT = 0.0;
    private static final String MAX_WEIGHT = "1000.00";

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
            String weightRegex = "[0-9]{1,3}\\.\\d{2}"; //for 0.01 to 999.99
            double value = Double.parseDouble(test);
            return (value > MIN_WEIGHT && test.matches(weightRegex)) || test.matches(MAX_WEIGHT);
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
