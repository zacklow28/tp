package seedu.address.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Maintains a history of commands executed by the user.
 * Allows navigation through the history of commands.
 */
public class CommandHistory {
    private List<String> commandHistory;
    private int currentIndex;

    /**
     * Initializes a new CommandHistory instance with an empty history and
     * sets the current index to -1, indicating no commands have been navigated.
     */
    public CommandHistory() {
        commandHistory = new ArrayList<>();
        currentIndex = -1;
    }

    /**
     * Adds a new command to the history.
     *
     * @param command The command to add to the history.
     */
    public void addCommand(String command) {
        commandHistory.add(command);
        currentIndex = commandHistory.size();
    }

    /**
     * Retrieves the previous command in the history and updates the current index.
     * If there is no previous command, returns null.
     *
     * @return The previous command, or null if at the start of the history.
     */
    public String getPreviousCommand() {
        if (currentIndex <= 0) {
            return null;
        }
        currentIndex--;
        return commandHistory.get(currentIndex);
    }

    /**
     * Retrieves the next command in the history and updates the current index.
     * If there is no next command, returns null.
     *
     * @return The next command, or null if at the end of the history.
     */
    public String getNextCommand() {
        if (currentIndex >= commandHistory.size() - 1) {
            return null;
        }
        currentIndex++;
        return commandHistory.get(currentIndex);
    }

    /**
     * Returns the current index in the command history.
     *
     * @return The current index in the history.
     */
    public int getCurrentIndex() {
        return currentIndex;
    }

    /**
     * Provides access to the entire history of commands.
     *
     * @return A list of all commands in the history.
     */
    public List<String> getCommandHistory() {
        return commandHistory;
    }
}
