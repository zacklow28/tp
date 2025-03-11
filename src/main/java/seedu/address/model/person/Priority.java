package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class Priority {
    public enum Level {
        LOW, MEDIUM, HIGH
    }

    public static final String MESSAGE_CONSTRAINTS = "Priority must be high, medium, or low";
    public static final String VALIDATION_REGEX = "HIGH|MEDIUM|LOW";

    public Level value;

    /**
     * Constructs a {@code Priority}.
     *
     * @param priority A valid priority level.
     */
    public Priority(String priority) {
        requireNonNull(priority);
        checkArgument(isValidPriority(priority), MESSAGE_CONSTRAINTS);
        this.value = Level.valueOf(priority);
    }

    /**
     * Returns true if a given string is a valid priority.
     */
    public static boolean isValidPriority(String test) {
        return test.toUpperCase().matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value.name();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Priority)) return false;
        Priority otherPriority = (Priority) other;
        return value == otherPriority.value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
