package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.ALLERGY_DESC_FISH;
import static seedu.address.logic.commands.CommandTestUtil.ALLERGY_DESC_PEANUTS;
import static seedu.address.logic.commands.CommandTestUtil.DIET_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.DIET_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.EMAIL_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.EMAIL_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.GENDER_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.GENDER_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.HEIGHT_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.HEIGHT_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_ADDRESS_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_ALLERGY_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_DIET_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_EMAIL_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_GENDER_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_HEIGHT_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_MEETING_DATE_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_NAME_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_PHONE_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_PRIORITY_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_WEIGHT_DESC;
import static seedu.address.logic.commands.CommandTestUtil.MEETING_DATE_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.MEETING_DATE_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.PREAMBLE_NON_EMPTY;
import static seedu.address.logic.commands.CommandTestUtil.PRIORITY_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.PRIORITY_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ALLERGY_FISH;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ALLERGY_PEANUTS;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DIET_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DIET_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GENDER_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GENDER_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HEIGHT_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HEIGHT_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MEETING_DATE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MEETING_DATE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PRIORITY_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PRIORITY_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WEIGHT_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WEIGHT_BOB;
import static seedu.address.logic.commands.CommandTestUtil.WEIGHT_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.WEIGHT_DESC_BOB;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_DIET;
import static seedu.address.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_GENDER;
import static seedu.address.logic.parser.CliSyntax.PREFIX_HEIGHT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEETING_DATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PRIORITY;
import static seedu.address.logic.parser.CliSyntax.PREFIX_WEIGHT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalPersons.AMY;
import static seedu.address.testutil.TypicalPersons.BOB;

import org.junit.jupiter.api.Test;

import seedu.address.logic.Messages;
import seedu.address.logic.commands.AddCommand;
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
import seedu.address.model.person.Weight;
import seedu.address.testutil.PersonBuilder;

public class AddCommandParserTest {
    private AddCommandParser parser = new AddCommandParser();

    @Test
    public void parse_allFieldsPresent_success() {
        Person expectedPerson = new PersonBuilder(BOB).withGender(VALID_GENDER_BOB).withHeight(VALID_HEIGHT_BOB)
                .withWeight(VALID_WEIGHT_BOB).withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_BOB)
                .withAddress(VALID_ADDRESS_BOB).withDiet(VALID_DIET_BOB).withPriority(VALID_PRIORITY_BOB)
                .withMeetingDate(VALID_MEETING_DATE_BOB).withAllergies(VALID_ALLERGY_PEANUTS).build();

        // whitespace only preamble
        assertParseSuccess(parser, NAME_DESC_BOB + GENDER_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB
                + PHONE_DESC_BOB + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB
                + MEETING_DATE_DESC_BOB + ALLERGY_DESC_PEANUTS, new AddCommand(expectedPerson));

        // multiple allergies - all accepted
        Person expectedPersonMultipleAllergies = new PersonBuilder(BOB).withGender(VALID_GENDER_BOB)
                .withHeight(VALID_HEIGHT_BOB).withWeight(VALID_WEIGHT_BOB).withPhone(VALID_PHONE_BOB)
                .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withDiet(VALID_DIET_BOB)
                .withPriority(VALID_PRIORITY_BOB).withMeetingDate(VALID_MEETING_DATE_BOB)
                .withAllergies(VALID_ALLERGY_PEANUTS, VALID_ALLERGY_FISH).build();
        assertParseSuccess(parser,
                NAME_DESC_BOB + GENDER_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH + ALLERGY_DESC_PEANUTS, new AddCommand(expectedPersonMultipleAllergies));
    }

    @Test
    public void parse_repeatedNonAllergyValue_failure() {
        // Setup command with all valid fields
        String validCommand = NAME_DESC_BOB + PHONE_DESC_BOB + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + GENDER_DESC_BOB
                + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB + MEETING_DATE_DESC_BOB;

        // Multiple names
        assertParseFailure(parser, NAME_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_NAME));

        // Multiple phones
        assertParseFailure(parser, PHONE_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE));

        // Multiple emails
        assertParseFailure(parser, EMAIL_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_EMAIL));

        // Multiple addresses
        assertParseFailure(parser, ADDRESS_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_ADDRESS));

        // Multiple genders
        assertParseFailure(parser, GENDER_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_GENDER));

        // Multiple heights
        assertParseFailure(parser, HEIGHT_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_HEIGHT));

        // Multiple weights
        assertParseFailure(parser, WEIGHT_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_WEIGHT));

        // Multiple diets
        assertParseFailure(parser, DIET_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_DIET));

        // Multiple meeting dates
        assertParseFailure(parser, MEETING_DATE_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_MEETING_DATE));

        // Multiple priorities
        assertParseFailure(parser, PRIORITY_DESC_AMY + validCommand,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PRIORITY));

        // Multiple fields repeated
        assertParseFailure(parser,
                NAME_DESC_AMY + GENDER_DESC_AMY
                        + HEIGHT_DESC_AMY + WEIGHT_DESC_AMY + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY
                        + DIET_DESC_AMY + PRIORITY_DESC_AMY + MEETING_DATE_DESC_AMY
                        + validCommand, Messages.getErrorMessageForDuplicatePrefixes(PREFIX_NAME, PREFIX_GENDER,
                        PREFIX_HEIGHT, PREFIX_WEIGHT, PREFIX_PHONE, PREFIX_EMAIL, PREFIX_ADDRESS, PREFIX_DIET,
                        PREFIX_PRIORITY, PREFIX_MEETING_DATE));
    }


    @Test
    public void parse_optionalFieldsMissing_success() {
        // zero allergies
        Person expectedPerson = new PersonBuilder(AMY).withGender(VALID_GENDER_AMY).withHeight(VALID_HEIGHT_AMY)
                .withWeight(VALID_WEIGHT_AMY).withPhone(VALID_PHONE_AMY).withEmail(VALID_EMAIL_AMY)
                .withAddress(VALID_ADDRESS_AMY).withDiet(VALID_DIET_AMY).withPriority(VALID_PRIORITY_AMY)
                .withMeetingDate(VALID_MEETING_DATE_AMY).withAllergies().build();
        assertParseSuccess(parser, NAME_DESC_AMY + GENDER_DESC_AMY + HEIGHT_DESC_AMY + WEIGHT_DESC_AMY
                + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY + DIET_DESC_AMY + PRIORITY_DESC_AMY
                + MEETING_DATE_DESC_AMY, new AddCommand(expectedPerson));
    }

    @Test
    public void parse_compulsoryFieldMissing_failure() {
        String missingNameExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_NAME) + "\n"
                + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingGenderExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_GENDER) + "\n"
                + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingHeightExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_HEIGHT) + "\n"
                + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingWeightExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_WEIGHT) + "\n"
                + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingEmailExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_EMAIL) + "\n"
                + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingAddressExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_ADDRESS) + "\n"
                + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingPhoneExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_PHONE) + "\n"
                + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingDietExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_DIET) + "\n"
                + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingPriorityExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_PRIORITY) + "\n"
                + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingMeetingDateExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_MEETING_DATE)
                + "\n" + String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE);
        String missingAllPrefixesExpectedMessage = Messages.getErrorMessageForMissingPrefixes(PREFIX_NAME,
                PREFIX_GENDER, PREFIX_HEIGHT, PREFIX_WEIGHT, PREFIX_PHONE, PREFIX_EMAIL, PREFIX_ADDRESS, PREFIX_DIET,
                PREFIX_PRIORITY, PREFIX_MEETING_DATE) + "\n" + String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                AddCommand.MESSAGE_USAGE);


        // Missing name prefix
        assertParseFailure(parser, GENDER_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB, missingNameExpectedMessage);

        // Missing gender prefix
        assertParseFailure(parser, NAME_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB, missingGenderExpectedMessage);

        // Missing height prefix
        assertParseFailure(parser, NAME_DESC_BOB + GENDER_DESC_BOB + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB, missingHeightExpectedMessage);

        // Missing weight prefix
        assertParseFailure(parser, NAME_DESC_BOB + GENDER_DESC_BOB + HEIGHT_DESC_BOB + PHONE_DESC_BOB
                + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB + MEETING_DATE_DESC_BOB,
                missingWeightExpectedMessage);

        // Missing phone prefix
        assertParseFailure(parser, NAME_DESC_BOB + GENDER_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB
                + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB
                + MEETING_DATE_DESC_BOB, missingPhoneExpectedMessage);

        // Missing email prefix
        assertParseFailure(parser, NAME_DESC_BOB + GENDER_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB
                + PHONE_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB
                + MEETING_DATE_DESC_BOB, missingEmailExpectedMessage);

        // Missing address prefix
        assertParseFailure(parser, NAME_DESC_BOB + GENDER_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB
                + PHONE_DESC_BOB + EMAIL_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB
                + MEETING_DATE_DESC_BOB, missingAddressExpectedMessage);


        // Missing diet prefix
        assertParseFailure(parser, NAME_DESC_BOB + GENDER_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB
                + PHONE_DESC_BOB + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + PRIORITY_DESC_BOB
                + MEETING_DATE_DESC_BOB, missingDietExpectedMessage);

        // Missing meeting date prefix
        assertParseFailure(parser, NAME_DESC_BOB + GENDER_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB
                + PHONE_DESC_BOB + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + PRIORITY_DESC_BOB,
                missingMeetingDateExpectedMessage);

        // Missing priority prefix
        assertParseFailure(parser, NAME_DESC_BOB + GENDER_DESC_BOB + HEIGHT_DESC_BOB + WEIGHT_DESC_BOB
                + PHONE_DESC_BOB + EMAIL_DESC_BOB + ADDRESS_DESC_BOB + DIET_DESC_BOB + MEETING_DATE_DESC_BOB,
                missingPriorityExpectedMessage);

        // All prefixes missing
        assertParseFailure(parser, "", missingAllPrefixesExpectedMessage);
    }

    @Test
    public void parse_invalidValue_failure() {
        // Invalid name: supply all required fields so that only the name is invalid.
        assertParseFailure(parser,
                INVALID_NAME_DESC
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Name.MESSAGE_CONSTRAINTS);

        // Invalid phone
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + INVALID_PHONE_DESC
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Phone.MESSAGE_CONSTRAINTS);

        // Invalid email
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + INVALID_EMAIL_DESC
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Email.MESSAGE_CONSTRAINTS);

        // Invalid address
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + INVALID_ADDRESS_DESC
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Address.MESSAGE_CONSTRAINTS);

        // Invalid gender
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + INVALID_GENDER_DESC
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Gender.MESSAGE_CONSTRAINTS);

        // Invalid height
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + INVALID_HEIGHT_DESC
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Height.MESSAGE_CONSTRAINTS);

        // Invalid weight
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + INVALID_WEIGHT_DESC
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Weight.MESSAGE_CONSTRAINTS);

        // Invalid diet
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + INVALID_DIET_DESC
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Diet.MESSAGE_CONSTRAINTS);

        // Invalid priority
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + INVALID_PRIORITY_DESC
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Priority.MESSAGE_CONSTRAINTS);

        // Invalid meeting date
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + INVALID_MEETING_DATE_DESC
                        + ALLERGY_DESC_FISH,
                MeetingDate.MESSAGE_CONSTRAINTS);

        // Invalid allergies
        assertParseFailure(parser,
                NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + INVALID_ALLERGY_DESC,
                Allergy.MESSAGE_CONSTRAINTS);

        // Two invalid values: only the first invalid value should be reported.
        assertParseFailure(parser,
                INVALID_NAME_DESC
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + INVALID_ADDRESS_DESC
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                Name.MESSAGE_CONSTRAINTS);

        // Non-empty preamble
        assertParseFailure(parser,
                PREAMBLE_NON_EMPTY
                        + NAME_DESC_BOB
                        + GENDER_DESC_BOB
                        + HEIGHT_DESC_BOB
                        + WEIGHT_DESC_BOB
                        + PHONE_DESC_BOB
                        + EMAIL_DESC_BOB
                        + ADDRESS_DESC_BOB
                        + DIET_DESC_BOB
                        + PRIORITY_DESC_BOB
                        + MEETING_DATE_DESC_BOB
                        + ALLERGY_DESC_FISH,
                String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));
    }
}
