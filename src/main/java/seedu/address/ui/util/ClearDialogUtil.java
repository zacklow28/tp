package seedu.address.ui.util;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;

/**
 * Utility class for showing a confirmation dialog when executing the clear command.
 * This class provides a static method to display a JavaFX confirmation dialog
 * and return the user's response.
 */
public class ClearDialogUtil {
    /**
     * Shows a dark-themed confirmation dialog, independent of the rest of the app UI.
     * @param title   Dialog window title
     * @param header  Header text of dialog
     * @param content Message body text
     * @return true if user clicks OK, false otherwise
     */
    public static boolean showConfirmationDialog(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);

        DialogPane dialogPane = alert.getDialogPane();

        dialogPane.getStylesheets().clear();

        dialogPane.getStylesheets().add(
                ClearDialogUtil.class.getResource("/view/ClearDialog.css").toExternalForm()
        );

        Optional<ButtonType> result = alert.showAndWait();
        return result.isPresent() && result.get() == ButtonType.OK;
    }
}
