package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class MeetingDateTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new MeetingDate(null));
    }

    @Test
    public void constructor_emptyString_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new MeetingDate(""));
    }

    @Test
    public void constructor_whitespaceOnly_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new MeetingDate(" "));
    }

    @Test
    public void constructor_invalidFormat_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new MeetingDate("01-04-2024"));
    }

    @Test
    public void constructor_invalidDate_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new MeetingDate("2024-02-30")); // Feb 30 doesn't exist
    }

    @Test
    public void constructor_invalidWord_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new MeetingDate("someday"));
    }

    @Test
    public void constructor_validDate_succeeds() {
        new MeetingDate("2024-04-01");
    }

    @Test
    public void constructor_defaultNone_succeeds() {
        new MeetingDate("none");
    }

    @Test
    public void isValidMeetingDate_invalidInputs_returnFalse() {
        assertFalse(MeetingDate.isValidMeetingDate(""));
        assertFalse(MeetingDate.isValidMeetingDate(" "));
        assertFalse(MeetingDate.isValidMeetingDate("01-01-2024"));
        // invalid month
        assertFalse(MeetingDate.isValidMeetingDate("2024-13-01"));
        // invalid day
        assertFalse(MeetingDate.isValidMeetingDate("2024-02-30"));
        assertFalse(MeetingDate.isValidMeetingDate("next monday"));
    }

    @Test
    public void isValidMeetingDate_validInputs_returnTrue() {
        assertTrue(MeetingDate.isValidMeetingDate("2024-01-01"));
        assertTrue(MeetingDate.isValidMeetingDate("9999-12-31"));
        assertTrue(MeetingDate.isValidMeetingDate("none"));
    }

    @Test
    public void equals() {
        MeetingDate d1 = new MeetingDate("2024-01-01");
        MeetingDate d2 = new MeetingDate("2024-01-01");
        MeetingDate d3 = new MeetingDate("2023-12-31");

        // same value -> returns true
        assertTrue(d1.equals(d2));
        // same object -> returns true
        assertTrue(d1.equals(d1));
        // different value -> returns false
        assertFalse(d1.equals(d3));
        // null -> returns false
        assertFalse(d1.equals(null));
        // different type -> returns false
        assertFalse(d1.equals("2024-01-01"));
    }
}
