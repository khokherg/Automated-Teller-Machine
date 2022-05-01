package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SecondController {

	@FXML
	private TextArea textArea;
	@FXML private Button btnClose;


	@FXML private void initialize()
	{

	}


		@FXML protected void handleCloseButton(ActionEvent event) {
			// Get a reference to the stage
			Stage stage = (Stage) btnClose.getScene().getWindow();
			// Close this window
			stage.close();


	}

}
