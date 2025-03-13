package seedu.address.model.person;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.model.tag.Tag;

/**
 * Represents a Person in the address book.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Person {

    // Identity fields
    private final Name name;
    private final Phone phone;
    private final Email email;

    // Data fields
    private final Address address;
    private final Gender gender;
    private final Height height;
    private final Weight weight;
    private final Diet diet;
    private final Priority priority;
    private final MeetingDate meetingDate;
    private final Set<Tag> tags = new HashSet<>();

    /**
     * Every field must be present and not null.
     */
    public Person(Name name, Gender gender, Height height, Weight weight, Phone phone, Email email, Address address,
                  Diet diet, Priority priority, MeetingDate meetingDate, Set<Tag> tags) {
        requireAllNonNull(name, gender, height, weight, phone, email, address, diet, priority, meetingDate, tags);
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
        this.tags.addAll(tags);
    }

    public Name getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Height getHeight() {
        return height;
    }

    public Weight getWeight() {
        return weight;
    }

    public Phone getPhone() {
        return phone;
    }

    public Email getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public Diet getDiet() {
        return diet;
    }

    public Priority getPriority() {
        return priority;
    }

    public MeetingDate getMeetingDate() {
        return meetingDate;
    }
    /**
     * Returns an immutable tag set, which throws {@code UnsupportedOperationException}
     * if modification is attempted.
     */
    public Set<Tag> getTags() {
        return Collections.unmodifiableSet(tags);
    }

    /**
     * Returns true if both persons have the same name.
     * This defines a weaker notion of equality between two persons.
     */
    public boolean isSamePerson(Person otherPerson) {
        if (otherPerson == this) {
            return true;
        }

        return otherPerson != null
                && otherPerson.getName().equals(getName());
    }

    /**
     * Returns true if both persons have the same identity and data fields.
     * This defines a stronger notion of equality between two persons.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Person)) {
            return false;
        }

        Person otherPerson = (Person) other;
        return name.equals(otherPerson.name)
                && gender.equals(otherPerson.gender)
                && height.equals(otherPerson.height)
                && weight.equals(otherPerson.weight)
                && phone.equals(otherPerson.phone)
                && email.equals(otherPerson.email)
                && address.equals(otherPerson.address)
                && diet.equals(otherPerson.diet)
                && priority.equals(otherPerson.priority)
                && meetingDate.equals(otherPerson.meetingDate)
                && tags.equals(otherPerson.tags);
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name, gender, height, weight, phone, email, address, diet, priority, meetingDate, tags);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("name", name)
                .add("gender", gender)
                .add("height", height)
                .add("weight", weight)
                .add("phone", phone)
                .add("email", email)
                .add("address", address)
                .add("diet", diet)
                .add("priority", priority)
                .add("meetingDate", meetingDate)
                .add("tags", tags)
                .toString();
    }

}
