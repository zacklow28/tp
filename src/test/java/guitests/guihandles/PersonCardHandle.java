package guitests.guihandles;

import java.util.List;
import java.util.stream.Collectors;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import seedu.address.model.person.Person;

/**
 * Provides a handle to a person card in the person list panel.
 */
public class PersonCardHandle extends NodeHandle<Node> {
    private static final String NAME_FIELD_ID = "#name";
    private static final String GENDER_FIELD_ID = "#gender";
    private static final String HEIGHT_FIELD_ID = "#height";
    private static final String WEIGHT_FIELD_ID = "#weight";
    private static final String PHONE_FIELD_ID = "#phone";
    private static final String EMAIL_FIELD_ID = "#email";
    private static final String ADDRESS_FIELD_ID = "#address";
    private static final String MEETING_DATE_FIELD_ID = "#meetingDate";
    private static final String ALL_TAGS_FIELD_ID = "#allTags";

    private final Label nameLabel;
    private final Label genderLabel;
    private final Label heightLabel;
    private final Label weightLabel;
    private final Label phoneLabel;
    private final Label emailLabel;
    private final Label addressLabel;
    private final Label meetingDateLabel;
    private final List<Label> tagLabels;

    /**
     * Constructs a PersonCardHandle.
     */
    public PersonCardHandle(Node cardNode) {
        super(cardNode);

        nameLabel = getChildNode(NAME_FIELD_ID);
        genderLabel = getChildNode(GENDER_FIELD_ID);
        heightLabel = getChildNode(HEIGHT_FIELD_ID);
        weightLabel = getChildNode(WEIGHT_FIELD_ID);
        phoneLabel = getChildNode(PHONE_FIELD_ID);
        emailLabel = getChildNode(EMAIL_FIELD_ID);
        addressLabel = getChildNode(ADDRESS_FIELD_ID);
        meetingDateLabel = getChildNode(MEETING_DATE_FIELD_ID);

        FlowPane tagsContainer = getChildNode(ALL_TAGS_FIELD_ID);
        tagLabels = tagsContainer.getChildren().stream()
                .filter(Label.class::isInstance)
                .map(Label.class::cast)
                .collect(Collectors.toList());
    }

    public String getName() {
        return nameLabel.getText();
    }
    public String getGender() {
        return genderLabel.getText();
    }
    public String getHeight() {
        return heightLabel.getText();
    }
    public String getWeight() {
        return weightLabel.getText();
    }
    public String getPhone() {
        return phoneLabel.getText();
    }
    public String getEmail() {
        return emailLabel.getText();
    }
    public String getAddress() {
        return addressLabel.getText();
    }
    public String getMeetingDate() {
        return meetingDateLabel.getText();
    }

    /**
     * Returns the complete list of tag texts in the order they are displayed.
     */
    public List<String> getTags() {
        return tagLabels.stream()
                .map(Label::getText)
                .collect(Collectors.toList());
    }

    /**
     * Returns the priority text, assumed to be the first label in allTags.
     */
    public String getPriority() {
        return tagLabels.size() >= 1 ? tagLabels.get(0).getText() : "";
    }

    /**
     * Returns the diet text, assumed to be the second label in allTags.
     */
    public String getDiet() {
        return tagLabels.size() >= 2 ? tagLabels.get(1).getText() : "";
    }

    /**
     * Compares the displayed fields of this card with those of a given Person.
     */
    public boolean equals(Person person) {
        boolean basicEquals = getName().equals(person.getName().fullName)
                && getGender().equals(person.getGender().gender)
                && getHeight().equals(person.getHeight() + " m")
                && getWeight().equals(person.getWeight() + " kg")
                && getPhone().equals(person.getPhone().value)
                && getEmail().equals(person.getEmail().value)
                && getAddress().equals(person.getAddress().value)
                && getMeetingDate().equals(person.getMeetingDate().toString());
        // Construct expected tag list: first priority, then "D: " + diet, then additional tags sorted alphabetically.
        List<String> expectedAdditionalTags = person.getTags().stream()
                .map(tag -> tag.tagName)
                .sorted()
                .collect(Collectors.toList());
        List<String> expectedTags = new java.util.ArrayList<>();
        expectedTags.add(person.getPriority().toString());
        expectedTags.add("D: " + person.getDiet().toString());
        expectedTags.addAll(expectedAdditionalTags);
        return basicEquals && getTags().equals(expectedTags);
    }
}
