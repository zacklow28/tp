package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's priority in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPriority(String)}
 */
public class Priority {

    public static final String MESSAGE_CONSTRAINTS =
            "Priority must be one of the following: h, m, l";

    private static final String VALIDATION_REGEX = "h|m|l|none";

    public static final String DEFAULT_PRIORITY = "none";

    public final String priority; // Can be null

    /**
     * Constructs a {@code Priority}.
     *  If the given priority is null or empty, it is stored as "none".
     *
     * @param priority A valid diet type.
     */
    public Priority(String priority) {
        requireNonNull(priority);
        checkArgument(isValidPriority(priority), MESSAGE_CONSTRAINTS);
        this.priority = priority;
    }

    /**
     * Returns true if a given string is a valid priority type.
     */
    public static boolean isValidPriority(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return priority;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Priority)) {
            return false;
        }

        Priority otherPriority = (Priority) other;
        return priority.equals(otherPriority.priority);
    }

    @Override
    public int hashCode() {
        return priority.hashCode();
    }
}
