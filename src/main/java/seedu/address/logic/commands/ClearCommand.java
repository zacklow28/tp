package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.AddressBook;
import seedu.address.model.Model;
import seedu.address.ui.util.ClearDialogUtil;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "VitaBook has been cleared!";

    private final boolean requireConfirmation;

    public ClearCommand() {
        this(true); // Production use defaults to confirmation
    }

    public ClearCommand(boolean requireConfirmation) {
        this.requireConfirmation = requireConfirmation;
    }

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);

        if (model.getAddressBook().getPersonList().isEmpty()) {
            return new CommandResult("Nothing on list!");
        }

        if (!requireConfirmation || ClearDialogUtil.showConfirmationDialog(
                "Confirm Clear", "Are you sure?", "This will delete all entries in your address book.")) {
            model.setAddressBook(new AddressBook());
            return new CommandResult(MESSAGE_SUCCESS);
        }

        return new CommandResult("Clear command cancelled.");
    }
}
