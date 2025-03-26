package seedu.address.ui;

import java.util.Comparator;
import java.util.Objects;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.person.Person;

/**
 * An UI component that displays information of a {@code Person}.
 */
public class PersonCard extends UiPart<Region> {

    private static final String FXML = "PersonListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Person person;
    @FXML
    private HBox cardPane;
    @FXML
    private Label name;
    @FXML
    private Label gender;
    @FXML
    private Label height;
    @FXML
    private Label weight;
    @FXML
    private Label phone;
    @FXML
    private Label email;
    @FXML
    private Label address;
    @FXML
    private FlowPane dietTag;
    @FXML
    private FlowPane priorityTag;
    @FXML
    private Label meetingDate;
    @FXML
    private Label remark;
    @FXML
    private FlowPane allAllergies;

    /**
     * Creates a {@code PersonCode} with the given {@code Person} and index to display.
     */
    public PersonCard(Person person) {
        super(FXML);
        this.person = person;

        name.setText(person.getName().fullName);
        gender.setText(person.getGender().gender);
        height.setText(person.getHeight().toString() + " m");
        weight.setText(person.getWeight().toString() + " kg");
        phone.setText(person.getPhone().value);
        email.setText(person.getEmail().value);
        address.setText(person.getAddress().value);
        meetingDate.setText(person.getMeetingDate().toString());
        remark.setText(person.getRemark().value);

        Label priorityLabel = new Label(person.getPriority().toString());
        priorityLabel.getStyleClass().addAll("priority-label", "priority-"
                + person.getPriority().toString().toLowerCase());
        allAllergies.getChildren().add(priorityLabel);

        Label dietLabel = new Label("D: " + person.getDiet().toString());
        dietLabel.getStyleClass().add("diet-label");
        allAllergies.getChildren().add(dietLabel);

        person.getAllergies().stream()
                .sorted(Comparator.comparing(allergy -> allergy.allergyName))
                .forEach(allergy -> {
                    Label allergyLabel = new Label(allergy.allergyName);
                    allergyLabel.getStyleClass().add("allergy-label");
                    allAllergies.getChildren().add(allergyLabel);
                });

    }

    @Override
    public boolean equals(Object other) {
        // short-circuit if same object
        if (other == this) {
            return true;
        }
        // instanceof handles nulls
        if (!(other instanceof PersonCard)) {
            return false;
        }
        PersonCard otherCard = (PersonCard) other;
        // Two PersonCards are equal if they have the same underlying person.
        return person.equals(otherCard.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person);
    }
}
