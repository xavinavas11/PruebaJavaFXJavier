package controlador;

import java.io.IOException;

import controlador.MainFX;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {
	
	public void Salir() {
		System.exit(0);
	}

	public void abrirNuevoDesign() {
		try {
			// Load the fxml file and create a new stage for the popup.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/Send.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("Send Profile");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);

			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
