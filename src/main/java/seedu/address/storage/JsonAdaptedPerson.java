package seedu.address.storage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.allergy.Allergy;
import seedu.address.model.person.Address;
import seedu.address.model.person.Diet;
import seedu.address.model.person.Email;
import seedu.address.model.person.Gender;
import seedu.address.model.person.Height;
import seedu.address.model.person.MeetingDate;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Priority;
import seedu.address.model.person.Remark;
import seedu.address.model.person.Weight;

/**
 * Jackson-friendly version of {@link Person}.
 */
class JsonAdaptedPerson {

    public static final String MISSING_FIELD_MESSAGE_FORMAT = "Person's %s field is missing!";

    private final String name;
    private final String gender;
    private final String height;
    private final String weight;
    private final String phone;
    private final String email;
    private final String address;
    private final String diet;
    private final String priority;
    private final String meetingDate;
    private final String remark;
    private final List<JsonAdaptedAllergy> allergies = new ArrayList<>();

    /**
     * Constructs a {@code JsonAdaptedPerson} with the given person details.
     */
    @JsonCreator
    public JsonAdaptedPerson(@JsonProperty("name") String name, @JsonProperty("gender") String gender,
            @JsonProperty("height") String height, @JsonProperty("weight") String weight,
            @JsonProperty("phone") String phone, @JsonProperty("email") String email,
            @JsonProperty("address") String address, @JsonProperty("diet") String diet,
            @JsonProperty("priority") String priority, @JsonProperty("meetingDate") String meetingDate,
            @JsonProperty("remark") String remark, @JsonProperty("allergies") List<JsonAdaptedAllergy> allergies) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.diet = diet;
        this.priority = priority;
        this.meetingDate = meetingDate;
        this.remark = remark;
        if (allergies != null) {
            this.allergies.addAll(allergies);
        }
    }

    /**
     * Converts a given {@code Person} into this class for Jackson use.
     */
    public JsonAdaptedPerson(Person source) {
        name = source.getName().fullName;
        gender = source.getGender().gender;
        height = source.getHeight().toString();
        weight = source.getWeight().toString();
        phone = source.getPhone().value;
        email = source.getEmail().value;
        address = source.getAddress().value;
        diet = source.getDiet().toString();
        priority = source.getPriority().toString();
        meetingDate = source.getMeetingDate().toString();
        remark = source.getRemark().value;
        allergies.addAll(source.getAllergies().stream()
                .map(JsonAdaptedAllergy::new)
                .collect(Collectors.toList()));
    }

    /**
     * Converts this Jackson-friendly adapted person object into the model's {@code Person} object.
     *
     * @throws IllegalValueException if there were any data constraints violated in the adapted person.
     */
    public Person toModelType() throws IllegalValueException {
        final List<Allergy> personAllergies = new ArrayList<>();
        for (JsonAdaptedAllergy allergy : allergies) {
            personAllergies.add(allergy.toModelType());
        }

        if (name == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Name.class.getSimpleName()));
        }
        if (!Name.isValidName(name)) {
            throw new IllegalValueException(Name.MESSAGE_CONSTRAINTS);
        }
        final Name modelName = new Name(name);

        if (gender == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Gender.class.getSimpleName()));
        }
        if (!Gender.isValidGender(gender)) {
            throw new IllegalValueException(Gender.MESSAGE_CONSTRAINTS);
        }
        final Gender modelGender = new Gender(gender);

        if (height == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Height.class.getSimpleName()));
        }
        if (!Height.isValidHeight(height)) {
            throw new IllegalValueException(Height.MESSAGE_CONSTRAINTS);
        }
        final Height modelHeight = new Height(height);

        if (weight == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Weight.class.getSimpleName()));
        }
        if (!Weight.isValidWeight(weight)) {
            throw new IllegalValueException(Weight.MESSAGE_CONSTRAINTS);
        }
        final Weight modelWeight = new Weight(weight);

        if (phone == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Phone.class.getSimpleName()));
        }
        if (!Phone.isValidPhone(phone)) {
            throw new IllegalValueException(Phone.MESSAGE_CONSTRAINTS);
        }
        final Phone modelPhone = new Phone(phone);

        if (email == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Email.class.getSimpleName()));
        }
        if (!Email.isValidEmail(email)) {
            throw new IllegalValueException(Email.MESSAGE_CONSTRAINTS);
        }
        final Email modelEmail = new Email(email);

        if (address == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Address.class.getSimpleName()));
        }
        if (!Address.isValidAddress(address)) {
            throw new IllegalValueException(Address.MESSAGE_CONSTRAINTS);
        }
        final Address modelAddress = new Address(address);

        if (diet == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Diet.class.getSimpleName()));
        }
        if (!Diet.isValidDiet(diet)) {
            throw new IllegalValueException(Diet.MESSAGE_CONSTRAINTS);
        }
        final Diet modelDiet = new Diet(diet);

        if (priority == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    Priority.class.getSimpleName()));
        }

        if (!Priority.isValidPriority(priority)) {
            throw new IllegalValueException(Priority.MESSAGE_CONSTRAINTS);
        }
        final Priority modelPriority = new Priority(priority);

        if (meetingDate == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    MeetingDate.class.getSimpleName()));
        }
        if (!MeetingDate.isValidMeetingDate(meetingDate)) {
            throw new IllegalValueException(MeetingDate.MESSAGE_CONSTRAINTS);
        }
        final MeetingDate modelMeetingDate = new MeetingDate(meetingDate);

        final Set<Allergy> modelAllergies = new HashSet<>(personAllergies);
        if (remark == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Remark.class.getSimpleName()));
        }
        final Remark modelRemark = new Remark(remark);
        return new Person(modelName, modelGender, modelHeight, modelWeight, modelPhone, modelEmail, modelAddress,
                modelDiet, modelPriority, modelMeetingDate, modelRemark, modelAllergies);
    }

}
