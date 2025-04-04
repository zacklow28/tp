package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.Objects;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Email;
import seedu.address.model.person.Person;

/**
 * Deletes a person identified using it's displayed index from the address book.
 */
public class DeleteCommand extends Command {

    public static final String COMMAND_WORD = "delete";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Deletes the patient identified by the index number used in the displayed person list"
            + " or by a specified email.\n"
            + "Parameters: INDEX (must be a positive integer) or valid email\n"
            + "Example: " + COMMAND_WORD + " 1\n"
            + "Example: " + COMMAND_WORD + " johndoe@example.com";

    public static final String MESSAGE_DELETE_PERSON_SUCCESS = "Deleted Person: %1$s";

    private final Index targetIndex;

    private final Email email;

    /**
     * Constructs a DeleteCommand to delete the person at the specified index.
     * @param targetIndex index
     */
    public DeleteCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
        this.email = null;
    }

    /**
     * Constructs a DeleteCommand to delete the person with the specified email.
     * @param email email
     */
    //overloaded constructor
    public DeleteCommand(Email email) {
        this.email = email;
        targetIndex = null;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Person> lastShownList = model.getFilteredPersonList();

        if (email != null) {
            Person personToDelete = model.getPersonByEmail(email);
            if (personToDelete == null) {
                throw new CommandException(Messages.MESSAGE_EMAIL_NOT_FOUND);
            }
            model.deletePerson(personToDelete);
            return new CommandResult(String.format(MESSAGE_DELETE_PERSON_SUCCESS, Messages.format(personToDelete)));
        }

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        }

        Person personToDelete = lastShownList.get(targetIndex.getZeroBased());
        model.deletePerson(personToDelete);
        return new CommandResult(String.format(MESSAGE_DELETE_PERSON_SUCCESS, Messages.format(personToDelete)));
    }


    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof DeleteCommand)) {
            return false;
        }

        DeleteCommand otherDeleteCommand = (DeleteCommand) other;

        // Compare both index and email safely. Object.equals handles null safely
        return Objects.equals(targetIndex, otherDeleteCommand.targetIndex)
                && Objects.equals(email, otherDeleteCommand.email);
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("targetIndex", targetIndex)
                .toString();
    }
}
