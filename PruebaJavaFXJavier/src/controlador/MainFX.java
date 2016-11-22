package controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @author Javier
 * @version 2.2
 * @see ControlFX
 * here
 */
public class MainFX extends Application {

	private AnchorPane rootLayout;
	public Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("My GitHub Profile");
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);

			// BorderPane root = new BorderPane();
			// Scene scene = new Scene(root,300,400);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// primaryStage.setScene(scene);

			primaryStage.show();

			initRootLayout();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/Profile.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 600, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
			Font.loadFont(getClass().getResourceAsStream("../resources/fonts/HipsterishFontNormal.ttf"), 20);

			primaryStage.setScene(scene);

			// // Give the controller access to the main app.
			// OneController controller = loader.getController();
			// controller.setMainApp(this);

			// imageRaw.setEffect(new GaussianBlur());
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
