package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

import java.text.ParseException;
import java.time.LocalDate;

import org.apache.commons.lang3.time.DateUtils;

/**
 * Represents a Person's meeting date with the nutritionist in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidMeetingDate(String)}
 */
public class MeetingDate {

    public static final String MESSAGE_CONSTRAINTS =
            "Meeting date must be valid and in the format YYYY-MM-DD.";

    private final String meetingDate;

    /**
     * Constructs a {@code MeetingDate}.
     *
     * @param date A valid meeting date or empty value
     */
    public MeetingDate(String date) {
        requireNonNull(date);
        checkArgument(isValidMeetingDate(date), MESSAGE_CONSTRAINTS);
        this.meetingDate = date;
    }

    /**
     * Returns true if a given string is a valid diet type.
     */
    public static boolean isValidMeetingDate(String test) {
        String dateRegex = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$"; // Enforces exact format
        if (!test.matches(dateRegex)) {
            return false;
        }
        try {
            DateUtils.parseDateStrictly(test, "yyyy-MM-dd");
            LocalDate parsedDate = LocalDate.parse(test); // Parse into LocalDate for year extraction
            int year = parsedDate.getYear();
            return year >= 1 && year <= 9999;
        } catch (ParseException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return meetingDate;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof MeetingDate)) {
            return false;
        }

        MeetingDate otherMeetingDate = (MeetingDate) other;
        return meetingDate.equals(otherMeetingDate.meetingDate);
    }

    @Override
    public int hashCode() {
        return meetingDate.hashCode();
    }
}
