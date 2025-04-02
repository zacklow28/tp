package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.parser.ParserUtil.MESSAGE_INVALID_INDEX;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.allergy.Allergy;
import seedu.address.model.person.Address;
import seedu.address.model.person.Diet;
import seedu.address.model.person.Email;
import seedu.address.model.person.Gender;
import seedu.address.model.person.MeetingDate;
import seedu.address.model.person.Name;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Priority;

public class ParserUtilTest {
    private static final String INVALID_NAME = "R@chel";
    private static final String INVALID_PHONE = "+651234";
    private static final String INVALID_ADDRESS = " ";
    private static final String INVALID_EMAIL = "example.com";
    private static final String INVALID_GENDER = "male";
    private static final String INVALID_DIET = "low-fat";
    private static final String INVALID_PRIORITY = "h";
    private static final String INVALID_MEETING_DATE = "12-12-2025";
    private static final String INVALID_ALLERGY = "#peanuts";

    private static final String VALID_NAME = "Rachel Walker";
    private static final String VALID_PHONE = "62345678";
    private static final String VALID_ADDRESS = "123 Main Street #0505";
    private static final String VALID_EMAIL = "rachel@example.com";
    private static final String VALID_GENDER = "M";
    private static final String VALID_DIET = "low fat";
    private static final String VALID_PRIORITY = "HIGH";
    private static final String VALID_MEETING_DATE = "2025-12-12";
    private static final String VALID_ALLERGY_1 = "peanuts";
    private static final String VALID_ALLERGY_2 = "fish";

    private static final String WHITESPACE = " \t\r\n";

    @Test
    public void parseIndex_invalidInput_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseIndex("10 a"));
    }

    @Test
    public void parseIndex_outOfRangeInput_throwsParseException() {
        assertThrows(ParseException.class, MESSAGE_INVALID_INDEX, ()
            -> ParserUtil.parseIndex(Long.toString(Integer.MAX_VALUE + 1)));
    }

    @Test
    public void parseIndex_validInput_success() throws Exception {
        // No whitespaces
        assertEquals(INDEX_FIRST_PERSON, ParserUtil.parseIndex("1"));

        // Leading and trailing whitespaces
        assertEquals(INDEX_FIRST_PERSON, ParserUtil.parseIndex("  1  "));
    }

    @Test
    public void parseName_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseName((String) null));
    }

    @Test
    public void parseName_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseName(INVALID_NAME));
    }

    @Test
    public void parseName_validValueWithoutWhitespace_returnsName() throws Exception {
        Name expectedName = new Name(VALID_NAME);
        assertEquals(expectedName, ParserUtil.parseName(VALID_NAME));
    }

    @Test
    public void parseName_validValueWithWhitespace_returnsTrimmedName() throws Exception {
        String nameWithWhitespace = WHITESPACE + VALID_NAME + WHITESPACE;
        Name expectedName = new Name(VALID_NAME);
        assertEquals(expectedName, ParserUtil.parseName(nameWithWhitespace));
    }

    @Test
    public void parsePhone_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parsePhone((String) null));
    }

    @Test
    public void parsePhone_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parsePhone(INVALID_PHONE));
    }

    @Test
    public void parsePhone_validValueWithoutWhitespace_returnsPhone() throws Exception {
        Phone expectedPhone = new Phone(VALID_PHONE);
        assertEquals(expectedPhone, ParserUtil.parsePhone(VALID_PHONE));
    }

    @Test
    public void parsePhone_validValueWithWhitespace_returnsTrimmedPhone() throws Exception {
        String phoneWithWhitespace = WHITESPACE + VALID_PHONE + WHITESPACE;
        Phone expectedPhone = new Phone(VALID_PHONE);
        assertEquals(expectedPhone, ParserUtil.parsePhone(phoneWithWhitespace));
    }

    @Test
    public void parseEmail_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseEmail((String) null));
    }

    @Test
    public void parseEmail_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseEmail(INVALID_EMAIL));
    }

    @Test
    public void parseEmail_validValueWithoutWhitespace_returnsEmail() throws Exception {
        Email expectedEmail = new Email(VALID_EMAIL);
        assertEquals(expectedEmail, ParserUtil.parseEmail(VALID_EMAIL));
    }

    @Test
    public void parseEmail_validValueWithWhitespace_returnsTrimmedEmail() throws Exception {
        String emailWithWhitespace = WHITESPACE + VALID_EMAIL + WHITESPACE;
        Email expectedEmail = new Email(VALID_EMAIL);
        assertEquals(expectedEmail, ParserUtil.parseEmail(emailWithWhitespace));
    }

    @Test
    public void parseAddress_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseAddress((String) null));
    }

    @Test
    public void parseAddress_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseAddress(INVALID_ADDRESS));
    }

    @Test
    public void parseAddress_validValueWithoutWhitespace_returnsAddress() throws Exception {
        Address expectedAddress = new Address(VALID_ADDRESS);
        assertEquals(expectedAddress, ParserUtil.parseAddress(VALID_ADDRESS));
    }

    @Test
    public void parseAddress_validValueWithWhitespace_returnsTrimmedAddress() throws Exception {
        String addressWithWhitespace = WHITESPACE + VALID_ADDRESS + WHITESPACE;
        Address expectedAddress = new Address(VALID_ADDRESS);
        assertEquals(expectedAddress, ParserUtil.parseAddress(addressWithWhitespace));
    }

    @Test
    public void parseGender_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseGender((String) null));
    }

    @Test
    public void parseGender_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseGender(INVALID_GENDER));
    }

    @Test
    public void parseGender_validValueWithoutWhitespace_returnsGender() throws Exception {
        Gender expectedGender = new Gender(VALID_GENDER);
        assertEquals(expectedGender, ParserUtil.parseGender(VALID_GENDER));
    }

    @Test
    public void parseGender_validValueWithWhitespace_returnsGender() throws Exception {
        String genderWithWhitespace = WHITESPACE + VALID_GENDER + WHITESPACE;
        Gender expectedGender = new Gender(VALID_GENDER);
        assertEquals(expectedGender, ParserUtil.parseGender(genderWithWhitespace));
    }

    @Test
    public void parseGender_validValueUpperCase_returnsGender() throws Exception {
        String genderUpperCase = VALID_GENDER.toUpperCase();
        Gender expectedGender = new Gender(VALID_GENDER);
        assertEquals(expectedGender, ParserUtil.parseGender(genderUpperCase));
    }

    @Test
    public void parseDiet_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseDiet((String) null));
    }

    @Test
    public void parseDiet_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseDiet(INVALID_DIET));
    }

    @Test
    public void parseDiet_validValueWithoutWhitespace_returnsDiet() throws Exception {
        Diet expectedDiet = new Diet(VALID_DIET);
        assertEquals(expectedDiet, ParserUtil.parseDiet(VALID_DIET));
    }

    @Test
    public void parseDiet_validValueWithWhitespace_returnsDiet() throws Exception {
        String dietWithWhitespace = WHITESPACE + VALID_DIET + WHITESPACE;
        Diet expectedDiet = new Diet(VALID_DIET);
        assertEquals(expectedDiet, ParserUtil.parseDiet(dietWithWhitespace));
    }

    @Test
    public void parseDiet_validValueUpperCase_returnsDiet() throws Exception {
        String dietUpperCase = VALID_DIET.toUpperCase();
        Diet expectedDiet = new Diet(VALID_DIET);
        assertEquals(expectedDiet, ParserUtil.parseDiet(dietUpperCase));
    }

    @Test
    public void parsePriority_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parsePriority((String) null));
    }

    @Test
    public void parsePriority_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parsePriority(INVALID_PRIORITY));
    }

    @Test
    public void parsePriority_validValueWithoutWhitespace_returnsPriority() throws Exception {
        Priority expectedPriority = new Priority(VALID_PRIORITY);
        assertEquals(expectedPriority, ParserUtil.parsePriority(VALID_PRIORITY));
    }

    @Test
    public void parsePriority_validValueWithWhitespace_returnsPriority() throws Exception {
        String priorityWithWhitespace = WHITESPACE + VALID_PRIORITY + WHITESPACE;
        Priority expectedPriority = new Priority(VALID_PRIORITY);
        assertEquals(expectedPriority, ParserUtil.parsePriority(priorityWithWhitespace));
    }

    @Test
    public void parsePriority_validValueUpperCase_returnsPriority() throws Exception {
        String priorityLowerCase = VALID_PRIORITY.toLowerCase();
        Priority expectedPriority = new Priority(VALID_PRIORITY);
        assertEquals(expectedPriority, ParserUtil.parsePriority(priorityLowerCase));
    }

    @Test
    public void parseMeetingDate_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseMeetingDate((String) null));
    }

    @Test
    public void parseMeetingDate_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseMeetingDate(INVALID_MEETING_DATE));
    }

    @Test
    public void parseMeetingDate_validValueWithoutWhitespace_returnsMeetingDate() throws Exception {
        MeetingDate expectedMeetingDate = new MeetingDate(VALID_MEETING_DATE);
        assertEquals(expectedMeetingDate, ParserUtil.parseMeetingDate(VALID_MEETING_DATE));
    }

    @Test
    public void parseMeetingDate_validValueWithWhitespace_returnsMeetingDate() throws Exception {
        String meetingDateWithWhitespace = WHITESPACE + VALID_MEETING_DATE + WHITESPACE;
        MeetingDate expectedMeetingDate = new MeetingDate(VALID_MEETING_DATE);
        assertEquals(expectedMeetingDate, ParserUtil.parseMeetingDate(meetingDateWithWhitespace));
    }

    @Test
    public void parseAllergy_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseAllergy(null));
    }

    @Test
    public void parseAllergy_invalidValue_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseAllergy(INVALID_ALLERGY));
    }

    @Test
    public void parseAllergy_validValueWithoutWhitespace_returnsAllergy() throws Exception {
        Allergy expectedAllergy = new Allergy(VALID_ALLERGY_1);
        assertEquals(expectedAllergy, ParserUtil.parseAllergy(VALID_ALLERGY_1));
    }

    @Test
    public void parseAllergy_validValueWithWhitespace_returnsTrimmedAllergy() throws Exception {
        String allergyWithWhitespace = WHITESPACE + VALID_ALLERGY_1 + WHITESPACE;
        Allergy expectedAllergy = new Allergy(VALID_ALLERGY_1);
        assertEquals(expectedAllergy, ParserUtil.parseAllergy(allergyWithWhitespace));
    }

    @Test
    public void parseAllergies_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ParserUtil.parseAllergies(null));
    }

    @Test
    public void parseAllergies_collectionWithInvalidAllergies_throwsParseException() {
        assertThrows(ParseException.class, () -> ParserUtil.parseAllergies(Arrays.asList(VALID_ALLERGY_1,
                INVALID_ALLERGY)));
    }

    @Test
    public void parseAllergies_emptyCollection_returnsEmptySet() throws Exception {
        assertTrue(ParserUtil.parseAllergies(Collections.emptyList()).isEmpty());
    }

    @Test
    public void parseAllergies_collectionWithValidAllergies_returnsAllergySet() throws Exception {
        Set<Allergy> actualAllergySet = ParserUtil.parseAllergies(Arrays.asList(VALID_ALLERGY_1, VALID_ALLERGY_2));
        Set<Allergy> expectedAllergySet = new HashSet<Allergy>(Arrays.asList(new Allergy(VALID_ALLERGY_1),
                new Allergy(VALID_ALLERGY_2)));

        assertEquals(expectedAllergySet, actualAllergySet);
    }
}
