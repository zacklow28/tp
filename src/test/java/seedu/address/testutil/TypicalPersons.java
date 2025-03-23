package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
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
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PRIORITY_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PRIORITY_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WEIGHT_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WEIGHT_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withGender("F").withHeight("1.65").withWeight("55").withDiet("low sodium")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withPriority("Low").withMeetingDate("2025-04-01").withRemark("She likes food")
            .withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withGender("M").withHeight("1.82").withWeight("85").withDiet("Low Carb")
            .withAddress("311, Clementi Ave 2, #02-25").withEmail("johnd@example.com").withPhone("98765432")
            .withPriority("High").withMeetingDate("2025-04-02").withRemark("He can't take beer!")
            .withTags("owesMoney", "friends").build();

    public static final Person CARL = new PersonBuilder().withName("Carl Kurz")
            .withGender("M").withHeight("1.75").withWeight("70").withDiet("low fat")
            .withPhone("95352563").withEmail("heinz@example.com").withAddress("wall street")
            .withPriority("Medium").withMeetingDate("2025-03-16").build();

    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier")
            .withGender("M").withHeight("1.68").withWeight("68").withDiet("low sugar")
            .withPhone("87652533").withEmail("cornelia@example.com").withAddress("10th street")
            .withPriority("Low").withMeetingDate("2025-03-20").withTags("friends").build();

    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer")
            .withGender("F").withHeight("1.60").withWeight("50").withDiet("low sodium")
            .withPhone("9482224").withEmail("werner@example.com").withAddress("michegan ave")
            .withPriority("Medium").withMeetingDate("2025-04-25").build();

    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz")
            .withGender("F").withHeight("1.65").withWeight("55").withDiet("low carb")
            .withPhone("9482427").withEmail("lydia@example.com").withAddress("little tokyo")
            .withPriority("Low").withMeetingDate("2025-05-05").build();

    public static final Person GEORGE = new PersonBuilder().withName("George Best")
            .withGender("M").withHeight("1.78").withWeight("76").withDiet("low sugar")
            .withPhone("9482442").withEmail("anna@example.com").withAddress("4th street")
            .withPriority("High").withMeetingDate("2025-06-15").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier")
            .withGender("M").withHeight("1.75").withWeight("75").withDiet("low sodium")
            .withPhone("8482424").withEmail("stefan@example.com").withAddress("little india")
            .withPriority("Low").withMeetingDate("2025-05-15").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller")
            .withGender("F").withHeight("1.60").withWeight("52").withDiet("low carb")
            .withPhone("8482131").withEmail("hans@example.com").withAddress("chicago ave")
            .withPriority("Low").withMeetingDate("2025-06-20").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY)
            .withGender(VALID_GENDER_AMY).withHeight(VALID_HEIGHT_AMY).withWeight(VALID_WEIGHT_AMY)
            .withDiet(VALID_DIET_AMY).withPhone(VALID_PHONE_AMY).withEmail(VALID_EMAIL_AMY)
            .withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).withPriority(VALID_PRIORITY_AMY)
            .withMeetingDate(VALID_MEETING_DATE_AMY).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB)
            .withGender(VALID_GENDER_BOB).withHeight(VALID_HEIGHT_BOB).withWeight(VALID_WEIGHT_BOB)
            .withDiet(VALID_DIET_BOB).withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_BOB)
            .withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .withPriority(VALID_PRIORITY_BOB).withMeetingDate(VALID_MEETING_DATE_BOB).build();

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
