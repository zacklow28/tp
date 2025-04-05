package seedu.address.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.address.storage.JsonAdaptedPerson.MISSING_FIELD_MESSAGE_FORMAT;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalPersons.BENSON;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Priority;

public class JsonAdaptedPersonTest {
    private static final String INVALID_NAME = "R_chel";
    private static final String INVALID_PHONE = "+651234";
    private static final String INVALID_ADDRESS = " ";
    private static final String INVALID_EMAIL = "example.com";
    private static final String INVALID_ALLERGY = "#peanuts";
    private static final String INVALID_PRIORITY = "forgotten";

    private static final String VALID_NAME = BENSON.getName().toString();
    private static final String VALID_GENDER = "m";
    private static final String VALID_HEIGHT = "1.7";
    private static final String VALID_WEIGHT = "70.00";
    private static final String VALID_PHONE = BENSON.getPhone().toString();
    private static final String VALID_EMAIL = BENSON.getEmail().toString();
    private static final String VALID_ADDRESS = BENSON.getAddress().toString();
    private static final String VALID_DIET = "low sodium";
    private static final String VALID_PRIORITY = "low";
    private static final String VALID_MEETING_DATE = "2025-12-12";
    private static final String VALID_REMARK = BENSON.getRemark().toString();
    private static final List<JsonAdaptedAllergy> VALID_ALLERGIES = BENSON.getAllergies().stream()
            .map(JsonAdaptedAllergy::new)
            .collect(Collectors.toList());

    @Test
    public void toModelType_validPersonDetails_returnsPerson() throws Exception {
        JsonAdaptedPerson person = new JsonAdaptedPerson(BENSON);
        assertEquals(BENSON, person.toModelType());
    }

    @Test
    public void toModelType_invalidName_throwsIllegalValueException() {
        JsonAdaptedPerson person =
                new JsonAdaptedPerson(INVALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT, VALID_PHONE, VALID_EMAIL,
                        VALID_ADDRESS, VALID_DIET, VALID_PRIORITY, VALID_MEETING_DATE, VALID_REMARK, VALID_ALLERGIES);
        String expectedMessage = Name.MESSAGE_CONSTRAINTS;
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_nullName_throwsIllegalValueException() {
        JsonAdaptedPerson person = new JsonAdaptedPerson(null, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT,
                VALID_PHONE, VALID_EMAIL, VALID_ADDRESS, VALID_DIET, VALID_PRIORITY, VALID_MEETING_DATE, VALID_REMARK,
                VALID_ALLERGIES);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Name.class.getSimpleName());
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_invalidPhone_throwsIllegalValueException() {
        JsonAdaptedPerson person =
                new JsonAdaptedPerson(VALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT,
                        INVALID_PHONE, VALID_EMAIL, VALID_ADDRESS, VALID_DIET, VALID_PRIORITY, VALID_MEETING_DATE,
                        VALID_REMARK, VALID_ALLERGIES);

        String expectedMessage = Phone.MESSAGE_CONSTRAINTS;
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_nullPhone_throwsIllegalValueException() {
        JsonAdaptedPerson person = new JsonAdaptedPerson(VALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT,
                null, VALID_EMAIL, VALID_ADDRESS, VALID_DIET, VALID_PRIORITY, VALID_MEETING_DATE,
                VALID_REMARK, VALID_ALLERGIES);

        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Phone.class.getSimpleName());
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_invalidEmail_throwsIllegalValueException() {
        JsonAdaptedPerson person =
                new JsonAdaptedPerson(VALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT, VALID_PHONE, INVALID_EMAIL,
                        VALID_ADDRESS, VALID_DIET, VALID_PRIORITY, VALID_MEETING_DATE, VALID_REMARK, VALID_ALLERGIES);

        String expectedMessage = Email.MESSAGE_CONSTRAINTS;
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_nullEmail_throwsIllegalValueException() {
        JsonAdaptedPerson person = new JsonAdaptedPerson(VALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT,
                VALID_PHONE, null, VALID_ADDRESS, VALID_DIET, VALID_PRIORITY, VALID_MEETING_DATE, VALID_REMARK,
                VALID_ALLERGIES);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Email.class.getSimpleName());
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_invalidAddress_throwsIllegalValueException() {
        JsonAdaptedPerson person =
                new JsonAdaptedPerson(VALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT, VALID_PHONE, VALID_EMAIL,
                        INVALID_ADDRESS, VALID_DIET, VALID_PRIORITY, VALID_MEETING_DATE, VALID_REMARK, VALID_ALLERGIES);

        String expectedMessage = Address.MESSAGE_CONSTRAINTS;
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_nullAddress_throwsIllegalValueException() {
        JsonAdaptedPerson person = new JsonAdaptedPerson(VALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT,
                VALID_PHONE, VALID_EMAIL, null, VALID_DIET, VALID_PRIORITY, VALID_MEETING_DATE, VALID_REMARK,
                VALID_ALLERGIES);

        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Address.class.getSimpleName());
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_invalidAllergies_throwsIllegalValueException() {
        List<JsonAdaptedAllergy> invalidAllergies = new ArrayList<>(VALID_ALLERGIES);
        invalidAllergies.add(new JsonAdaptedAllergy(INVALID_ALLERGY));
        JsonAdaptedPerson person =
                new JsonAdaptedPerson(VALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT, VALID_PHONE, VALID_EMAIL,
                        VALID_ADDRESS, VALID_DIET, VALID_PRIORITY, VALID_MEETING_DATE, VALID_REMARK, invalidAllergies);

        assertThrows(IllegalValueException.class, person::toModelType);
    }

    @Test
    public void toModelType_invalidPriority_throwsIllegalValueException() {
        JsonAdaptedPerson person = new JsonAdaptedPerson(VALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT,
                VALID_PHONE, VALID_EMAIL, VALID_ADDRESS, VALID_DIET, INVALID_PRIORITY, VALID_MEETING_DATE,
                VALID_REMARK, VALID_ALLERGIES);
        String expectedMessage = Priority.MESSAGE_CONSTRAINTS;
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_nullPriority_throwsIllegalValueException() {
        JsonAdaptedPerson person = new JsonAdaptedPerson(VALID_NAME, VALID_GENDER, VALID_HEIGHT, VALID_WEIGHT,
                VALID_PHONE, VALID_EMAIL, VALID_ADDRESS, VALID_DIET, null, VALID_MEETING_DATE, VALID_REMARK,
                VALID_ALLERGIES);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Priority.class.getSimpleName());
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }


}
