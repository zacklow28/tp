package seedu.address.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of address book states over time.
 */
public class VersionedAddressBook extends AddressBook {
    private final List<ReadOnlyAddressBook> addressBookStateList;
    private int currentStatePointer;

    /**
     * Constructs a VersionedAddressBook.
     * @param initialState The initial state of the address book
     */
    public VersionedAddressBook(ReadOnlyAddressBook initialState) {
        super(initialState);
        addressBookStateList = new ArrayList<>();
        addressBookStateList.add(new AddressBook(initialState));
        currentStatePointer = 0;
    }

    /**
     * Saves the current address book state in its history.
     */
    public void commit() {
        // Remove all states after the current pointer position (to ensure no "future" states)
        addressBookStateList.subList(currentStatePointer + 1, addressBookStateList.size()).clear();

        // Add the new current state
        addressBookStateList.add(new AddressBook(this));

        // Move pointer forward
        currentStatePointer++;
    }

    /**
     * Restores the previous address book state.
     * @throws IllegalStateException if there are no previous states.
     */
    public void undo() {
        if (!canUndo()) {
            throw new IllegalStateException("No previous state to undo.");
        }
        currentStatePointer--;
        resetData(addressBookStateList.get(currentStatePointer));
    }

    /**
     * Restores the next address book state.
     * @throws IllegalStateException if there are no next states.
     */
    public void redo() {
        if (!canRedo()) {
            throw new IllegalStateException("No next state to redo.");
        }
        currentStatePointer++;
        resetData(addressBookStateList.get(currentStatePointer));
    }

    /**
     * Returns true if there is a previous state.
     */
    public boolean canUndo() {
        return currentStatePointer > 0;
    }

    /**
     * Returns true if there is a next state.
     */
    public boolean canRedo() {
        return currentStatePointer < addressBookStateList.size() - 1;
    }


    public int getCurrentStatePointer() {
        return currentStatePointer;
    }
}
