package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {
	ATMArrayList atm = new ATMArrayList();
	@FXML private Button btnDisplay;
	@FXML private Button btnClear;
	@FXML private TextArea textArea;
	@FXML private TextField withdraw;
	@FXML private TextField deposit;
	@FXML private TextField id;

	@FXML private void initialize()
	{


		btnClear.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				onClearClicked();
			}
		});


	}

	private void onClearClicked()
	{

		id.setText(" ");
		withdraw.setText(" ");
		deposit.setText(" ");
		textArea.setText(" ");
	}

	// Click handler for Open Display button
		@FXML protected void handleDisplayButton(ActionEvent event) {
			// Open the second window (stage)
			try {
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Second.fxml"));
				Scene scene = new Scene(root,200,200);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage secondStage = new Stage();
				secondStage.setScene(scene);
				secondStage.initModality(Modality.APPLICATION_MODAL);  // Use this to make the 2nd window modal (must close 2nd window to return to main window)
				secondStage.showAndWait();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
}
