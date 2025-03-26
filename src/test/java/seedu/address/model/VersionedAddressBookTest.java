package seedu.address.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

public class VersionedAddressBookTest {
    private final VersionedAddressBook versionedAddressBook = new VersionedAddressBook(getTypicalAddressBook());

    @Test
    public void constructor() {
        assertEquals(getTypicalAddressBook().getPersonList(), versionedAddressBook.getPersonList());
    }

    @Test
    public void commit_statePointerIncremented() {
        int initialPointer = versionedAddressBook.getCurrentStatePointer();
        versionedAddressBook.commit();
        assertEquals(initialPointer + 1, versionedAddressBook.getCurrentStatePointer());
    }


    @Test
    public void undo_canUndoAfterCommit_returnsTrue() {
        versionedAddressBook.removePerson(versionedAddressBook.getPersonList().get(0));
        versionedAddressBook.commit();
        assertTrue(versionedAddressBook.canUndo());
        assertNotEquals(getTypicalAddressBook().getPersonList(), versionedAddressBook.getPersonList());
    }

    @Test
    public void undo_changesAddressBookToPrevious_statePointerDecremented() {
        versionedAddressBook.removePerson(versionedAddressBook.getPersonList().get(0));
        versionedAddressBook.commit();
        versionedAddressBook.undo();
        assertEquals(getTypicalAddressBook().getPersonList(), versionedAddressBook.getPersonList());
        assertEquals(0, versionedAddressBook.getCurrentStatePointer());
    }

    @Test
    public void undo_cannotUndoWithNoPreviousStates_throwsIllegalStateException() {
        //cannot undo if there are no previous states
        assertThrows(IllegalStateException.class, versionedAddressBook::undo);
        assertFalse(versionedAddressBook.canUndo());
    }

    @Test
    public void redo_canRedoAfterUndo_returnsTrue() {
        versionedAddressBook.removePerson(versionedAddressBook.getPersonList().get(0));
        versionedAddressBook.commit();
        versionedAddressBook.undo();
        assertTrue(versionedAddressBook.canRedo());
    }

    @Test
    public void redo_changesAddressBookToNext_statePointerIncremented() {
        versionedAddressBook.removePerson(versionedAddressBook.getPersonList().get(0));
        versionedAddressBook.commit();
        versionedAddressBook.undo();
        versionedAddressBook.redo();
        //get back deleted version
        assertNotEquals(getTypicalAddressBook().getPersonList(), versionedAddressBook.getPersonList());
        assertEquals(1, versionedAddressBook.getCurrentStatePointer());
    }

    @Test
    public void redo_cannotRedoWithNoNextStates_throwsIllegalStateException() {
        //cannot redo if there are no next states
        assertThrows(IllegalStateException.class, versionedAddressBook::redo);
        assertFalse(versionedAddressBook.canRedo());
    }
}
