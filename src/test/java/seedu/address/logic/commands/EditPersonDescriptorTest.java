package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ALLERGY_HUSBAND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.EditCommand.EditPersonDescriptor;
import seedu.address.testutil.EditPersonDescriptorBuilder;

public class EditPersonDescriptorTest {

    @Test
    public void equals() {
        // same values -> returns true
        EditPersonDescriptor descriptorWithSameValues = new EditPersonDescriptor(DESC_AMY);
        assertTrue(DESC_AMY.equals(descriptorWithSameValues));

        // same object -> returns true
        assertTrue(DESC_AMY.equals(DESC_AMY));

        // null -> returns false
        assertFalse(DESC_AMY.equals(null));

        // different types -> returns false
        assertFalse(DESC_AMY.equals(5));

        // different values -> returns false
        assertFalse(DESC_AMY.equals(DESC_BOB));

        // different name -> returns false
        EditPersonDescriptor editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withName(VALID_NAME_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different gender -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withGender("m").build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different height -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withHeight("1.90").build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different weight -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withWeight("80").build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different phone -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withPhone(VALID_PHONE_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different email -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withEmail(VALID_EMAIL_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different address -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withAddress(VALID_ADDRESS_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different diet -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withDiet("regular").build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different priority -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withPriority("medium").build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different meeting date -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withMeetingDate("2025-12-25").build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different allergies -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withAllergies(VALID_ALLERGY_HUSBAND).build();
        assertFalse(DESC_AMY.equals(editedAmy));
    }

    @Test
    public void toStringMethod() {
        EditPersonDescriptor editPersonDescriptor = new EditPersonDescriptor();
        String expected = EditPersonDescriptor.class.getCanonicalName() + "{name="
                + editPersonDescriptor.getName().orElse(null) + ", gender="
                + editPersonDescriptor.getGender().orElse(null) + ", height="
                + editPersonDescriptor.getHeight().orElse(null) + ", weight="
                + editPersonDescriptor.getWeight().orElse(null) + ", phone="
                + editPersonDescriptor.getPhone().orElse(null) + ", email="
                + editPersonDescriptor.getEmail().orElse(null) + ", address="
                + editPersonDescriptor.getAddress().orElse(null) + ", diet="
                + editPersonDescriptor.getDiet().orElse(null) + ", priority="
                + editPersonDescriptor.getPriority().orElse(null) + ", meetingDate="
                + editPersonDescriptor.getMeetingDate().orElse(null) + ", allergies="
                + editPersonDescriptor.getAllergies().orElse(null) + "}";
        assertEquals(expected, editPersonDescriptor.toString());
    }

}
