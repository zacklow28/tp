package seedu.address.logic;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import seedu.address.logic.parser.Prefix;
import seedu.address.model.person.Person;

/**
 * Container for user visible messages.
 */
public class Messages {

    public static final String MESSAGE_UNKNOWN_COMMAND = "Unknown command";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format! \n%1$s";
    public static final String MESSAGE_INVALID_PERSON_DISPLAYED_INDEX = "Invalid patient index.";
    public static final String MESSAGE_MISSING_FIELDS = "The following required field(s) is/are missing: ";
    public static final String MESSAGE_PERSONS_LISTED_OVERVIEW = "%1$d patients listed!";
    public static final String MESSAGE_DUPLICATE_FIELDS =
                "Multiple values specified for the following single-valued field(s): ";
    public static final String MESSAGE_EMAIL_NOT_FOUND = "The email provided does not exist";

    /**
     * Returns an error message indicating the duplicate prefixes.
     */
    public static String getErrorMessageForDuplicatePrefixes(Prefix... duplicatePrefixes) {
        assert duplicatePrefixes.length > 0;

        Set<String> duplicateFields =
                Stream.of(duplicatePrefixes).map(Prefix::toString).collect(Collectors.toSet());

        return MESSAGE_DUPLICATE_FIELDS + String.join(" ", duplicateFields);
    }

    /**
     * Formats the {@code person} for display to the user.
     */
    public static String format(Person person) {
        final StringBuilder builder = new StringBuilder();
        builder.append(person.getName())
                .append("; Gender: ")
                .append(person.getGender())
                .append("; Height: ")
                .append(person.getHeight()).append(" cm")
                .append("; Weight: ")
                .append(person.getWeight()).append(" kg")
                .append("; Phone: ")
                .append(person.getPhone())
                .append("; Email: ")
                .append(person.getEmail())
                .append("; Address: ")
                .append(person.getAddress())
                .append("; Diet: ")
                .append(person.getDiet())
                .append("; Priority: ")
                .append(person.getPriority())
                .append("; Meeting Date: ")
                .append(person.getMeetingDate())
                .append("; Remark: ")
                .append(person.getRemark())
                .append("; Allergies: ");
        person.getAllergies().forEach(builder::append);
        return builder.toString();
    }

    /**
     * Returns an error message indicating the missing prefixes.
     */
    public static String getErrorMessageForMissingPrefixes(Prefix... missingPrefixes) {
        assert missingPrefixes.length > 0;

        Set<String> missingFields =
                Stream.of(missingPrefixes).map(Prefix::toString).collect(Collectors.toSet());

        return MESSAGE_MISSING_FIELDS + String.join(", ", missingFields);
    }
}
