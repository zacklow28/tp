package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's email in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidEmail(String)}
 */
public class Email {

    private static final String SPECIAL_CHARACTERS = "+_.-";

    public static final String MESSAGE_CONSTRAINTS = "Emails should be of the format local-part@domain "
            + "and must satisfy the following constraints:\n"
            + "1. The local-part (before the '@') should contain only alphanumeric characters and the "
            + "special characters "
            + "(" + SPECIAL_CHARACTERS + "). It must not start or end with a special character.\n"
            + "2. The domain (after the '@') must be made up of domain labels separated by periods "
            + "(e.g., example.com).\n"
            + "   Each domain label must:\n"
            + "   - start and end with an alphanumeric character,\n"
            + "   - contain only alphanumeric characters or hyphens in between.\n"
            + "   The domain must end with a top-level domain (TLD), such as '.com', which must be at least "
            + "2 characters long.";


    private static final String ALPHANUMERIC_NO_UNDERSCORE = "[^\\W_]+";
    private static final String LOCAL_PART_REGEX = "^" + ALPHANUMERIC_NO_UNDERSCORE
            + "([+" + SPECIAL_CHARACTERS + "]" + ALPHANUMERIC_NO_UNDERSCORE + ")*";

    private static final String DOMAIN_PART_REGEX = ALPHANUMERIC_NO_UNDERSCORE
            + "(-" + ALPHANUMERIC_NO_UNDERSCORE + ")*";

    private static final String DOMAIN_REGEX = "(" + DOMAIN_PART_REGEX + "\\.)*" // subdomains
            + DOMAIN_PART_REGEX + "\\."
            + "[a-zA-Z]{2,}";

    public static final String VALIDATION_REGEX = LOCAL_PART_REGEX + "@" + DOMAIN_REGEX;

    public final String value;

    /**
     * Constructs an {@code Email} object after validating the given string.
     *
     * @param email A string representing the email address.
     * @throws NullPointerException if {@code email} is null.
     * @throws IllegalArgumentException if {@code email} does not conform to the defined email format.
     */
    public Email(String email) {
        requireNonNull(email);
        checkArgument(isValidEmail(email), MESSAGE_CONSTRAINTS);
        value = email;
    }

    public static boolean isValidEmail(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Email)) {
            return false;
        }
        Email otherEmail = (Email) other;
        return value.equalsIgnoreCase(otherEmail.value);
    }

    @Override
    public int hashCode() {
        return value.toLowerCase().hashCode();
    }
}
