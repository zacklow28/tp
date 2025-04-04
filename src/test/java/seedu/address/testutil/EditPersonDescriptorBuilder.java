package seedu.address.testutil;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import seedu.address.logic.commands.EditCommand.EditPersonDescriptor;
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

/**
 * A utility class to help with building EditPersonDescriptor objects.
 */
public class EditPersonDescriptorBuilder {

    private EditPersonDescriptor descriptor;

    public EditPersonDescriptorBuilder() {
        descriptor = new EditPersonDescriptor();
    }

    public EditPersonDescriptorBuilder(EditPersonDescriptor descriptor) {
        this.descriptor = new EditPersonDescriptor(descriptor);
    }

    /**
     * Returns an {@code EditPersonDescriptor} with fields containing {@code person}'s details
     */
    public EditPersonDescriptorBuilder(Person person) {
        descriptor = new EditPersonDescriptor();
        descriptor.setName(person.getName());
        descriptor.setGender(person.getGender());
        descriptor.setHeight(person.getHeight());
        descriptor.setWeight(person.getWeight());
        descriptor.setPhone(person.getPhone());
        descriptor.setEmail(person.getEmail());
        descriptor.setAddress(person.getAddress());
        descriptor.setDiet(person.getDiet());
        descriptor.setPriority(person.getPriority());
        descriptor.setMeetingDate(person.getMeetingDate());
        descriptor.setAllergies(person.getAllergies());
    }

    /**
     * Sets the {@code Name} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withName(String name) {
        descriptor.setName(new Name(name));
        return this;
    }

    /**
     * Sets the {@code Gender} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withGender(String gender) {
        descriptor.setGender(new Gender(gender));
        return this;
    }

    /**
     * Sets the {@code Height} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withHeight(String height) {
        descriptor.setHeight(new Height(height));
        return this;
    }

    /**
     * Sets the {@code Weight} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withWeight(String weight) {
        descriptor.setWeight(new Weight(weight));
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withPhone(String phone) {
        descriptor.setPhone(new Phone(phone));
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withEmail(String email) {
        descriptor.setEmail(new Email(email));
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withAddress(String address) {
        descriptor.setAddress(new Address(address));
        return this;
    }

    /**
     * Sets the {@code Diet} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withDiet(String diet) {
        descriptor.setDiet(new Diet(diet));
        return this;
    }

    /**
     * Sets the {@code Priority} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withPriority(String priority) {
        descriptor.setPriority(new Priority(priority));
        return this;
    }

    /**
     * Sets the {@code Meeting date} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditPersonDescriptorBuilder withMeetingDate(String meetingDate) {
        descriptor.setMeetingDate(new MeetingDate(meetingDate));
        return this;
    }

    /**
     * Parses the {@code allergies} into a {@code Set<Allergy>} and set it to the {@code EditPersonDescriptor}
     * that we are building.
     */
    public EditPersonDescriptorBuilder withAllergies(String... allergies) {
        Set<Allergy> allergySet = Stream.of(allergies).map(Allergy::new).collect(Collectors.toSet());
        descriptor.setAllergies(allergySet);
        return this;
    }

    public EditPersonDescriptor build() {
        return descriptor;
    }
}
