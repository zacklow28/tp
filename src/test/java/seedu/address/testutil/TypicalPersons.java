package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PRIORITY_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PRIORITY_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

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
            .withGender("F").withHeight("165").withWeight("55").withDiet("Vegetarian")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withPriority("Low").withMeetingDate("2025-04-01")
            .withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withGender("M").withHeight("182").withWeight("85").withDiet("Low Carb")
            .withAddress("311, Clementi Ave 2, #02-25").withEmail("johnd@example.com").withPhone("98765432")
            .withPriority("High").withMeetingDate("2025-04-02").withTags("owesMoney", "friends").build();

    public static final Person CARL = new PersonBuilder().withName("Carl Kurz")
            .withGender("M").withHeight("175").withWeight("70").withDiet("Keto")
            .withPhone("95352563").withEmail("heinz@example.com").withAddress("wall street")
            .withPriority("Medium").withMeetingDate("2025-03-16").build();

    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier")
            .withGender("M").withHeight("168").withWeight("68").withDiet("Vegan")
            .withPhone("87652533").withEmail("cornelia@example.com").withAddress("10th street")
            .withPriority("Low").withMeetingDate("2025-03-20").withTags("friends").build();

    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer")
            .withGender("F").withHeight("160").withWeight("50").withDiet("Vegetarian")
            .withPhone("9482224").withEmail("werner@example.com").withAddress("michegan ave")
            .withPriority("Medium").withMeetingDate("2025-04-25").build();

    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz")
            .withGender("F").withHeight("165").withWeight("55").withDiet("Gluten-Free")
            .withPhone("9482427").withEmail("lydia@example.com").withAddress("little tokyo")
            .withPriority("Low").withMeetingDate("2025-05-05").build();

    public static final Person GEORGE = new PersonBuilder().withName("George Best")
            .withGender("M").withHeight("178").withWeight("76").withDiet("Mediterranean")
            .withPhone("9482442").withEmail("anna@example.com").withAddress("4th street")
            .withPriority("High").withMeetingDate("2025-06-15").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier")
            .withGender("M").withHeight("175").withWeight("75").withDiet("Keto")
            .withPhone("8482424").withEmail("stefan@example.com").withAddress("little india")
            .withPriority("Low").withMeetingDate("2025-05-15").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller")
            .withGender("F").withHeight("160").withWeight("52").withDiet("Vegan")
            .withPhone("8482131").withEmail("hans@example.com").withAddress("chicago ave")
            .withPriority("Low").withMeetingDate("2025-06-20").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY)
            .withGender("F").withHeight("162").withWeight("53").withDiet("Gluten-Free")
            .withPhone(VALID_PHONE_AMY).withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY)
            .withTags(VALID_TAG_FRIEND).withPriority(VALID_PRIORITY_AMY).withMeetingDate("2025-03-21").build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB)
            .withGender("M").withHeight("180").withWeight("80").withDiet("Paleo")
            .withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND).withPriority(VALID_PRIORITY_BOB)
            .withMeetingDate("2025-04-25").build();

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
