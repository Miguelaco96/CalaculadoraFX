import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Carga el archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/FXMLDocument.fxml"));

        // Crea una escena
        Scene scene = new Scene(root);

        // Establece el título de la ventana
        stage.setTitle("Mi Aplicación JavaFX");

        // Establece la escena en la ventana
        stage.setScene(scene);

        // Muestra la ventana
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}