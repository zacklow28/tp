package seedu.address.testutil;

import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ALLERGY;
import static seedu.address.logic.parser.CliSyntax.PREFIX_DIET;
import static seedu.address.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_GENDER;
import static seedu.address.logic.parser.CliSyntax.PREFIX_HEIGHT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEETING_DATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PRIORITY;
import static seedu.address.logic.parser.CliSyntax.PREFIX_WEIGHT;

import java.util.Set;

import seedu.address.logic.commands.AddCommand;
import seedu.address.logic.commands.EditCommand.EditPersonDescriptor;
import seedu.address.model.allergy.Allergy;
import seedu.address.model.person.Person;

/**
 * A utility class for Person.
 */
public class PersonUtil {

    /**
     * Returns an add command string for adding the {@code person}.
     */
    public static String getAddCommand(Person person) {
        return AddCommand.COMMAND_WORD + " " + getPersonDetails(person);
    }

    /**
     * Returns the part of command string for the given {@code person}'s details.
     */
    public static String getPersonDetails(Person person) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_NAME).append(person.getName().fullName).append(" ");
        sb.append(PREFIX_PHONE).append(person.getPhone().value).append(" ");
        sb.append(PREFIX_EMAIL).append(person.getEmail().value).append(" ");
        sb.append(PREFIX_ADDRESS).append(person.getAddress().value).append(" ");
        sb.append(PREFIX_GENDER).append(person.getGender()).append(" ");
        sb.append(PREFIX_HEIGHT).append(person.getHeight()).append(" ");
        sb.append(PREFIX_WEIGHT).append(person.getWeight()).append(" ");
        sb.append(PREFIX_DIET).append(person.getDiet()).append(" ");
        sb.append(PREFIX_PRIORITY).append(person.getPriority()).append(" ");
        sb.append(PREFIX_MEETING_DATE).append(person.getMeetingDate()).append(" ");
        person.getAllergies().forEach(
                s -> sb.append(PREFIX_ALLERGY).append(s.allergyName).append(" ")
        );
        return sb.toString();
    }

    /**
     * Returns the part of command string for the given {@code EditPersonDescriptor}'s details.
     */
    public static String getEditPersonDescriptorDetails(EditPersonDescriptor descriptor) {
        StringBuilder sb = new StringBuilder();
        descriptor.getName().ifPresent(name -> sb.append(PREFIX_NAME).append(name.fullName).append(" "));
        descriptor.getPhone().ifPresent(phone -> sb.append(PREFIX_PHONE).append(phone.value).append(" "));
        descriptor.getEmail().ifPresent(email -> sb.append(PREFIX_EMAIL).append(email.value).append(" "));
        descriptor.getAddress().ifPresent(address -> sb.append(PREFIX_ADDRESS).append(address.value).append(" "));
        descriptor.getGender().ifPresent(gender -> sb.append(PREFIX_GENDER).append(gender).append(" "));
        descriptor.getHeight().ifPresent(height -> sb.append(PREFIX_HEIGHT).append(height).append(" "));
        descriptor.getWeight().ifPresent(weight -> sb.append(PREFIX_WEIGHT).append(weight).append(" "));
        descriptor.getDiet().ifPresent(diet -> sb.append(PREFIX_DIET).append(diet).append(" "));
        descriptor.getPriority().ifPresent(priority -> sb.append(PREFIX_PRIORITY)
                .append(priority.getValue()).append(" "));
        descriptor.getMeetingDate().ifPresent(meetingDate -> sb.append(PREFIX_MEETING_DATE)
                .append(meetingDate).append(" "));
        if (descriptor.getAllergies().isPresent()) {
            Set<Allergy> allergies = descriptor.getAllergies().get();
            if (allergies.isEmpty()) {
                sb.append(PREFIX_ALLERGY);
            } else {
                allergies.forEach(allergy -> sb.append(PREFIX_ALLERGY).append(allergy.allergyName).append(" "));
            }
        }
        return sb.toString();
    }
}
