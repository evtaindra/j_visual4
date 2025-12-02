
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Bikin karakter dulu (dari Hari 1-2)
        Character steve = new Character("Steve", 100, 1);

        // Label = papan nama di depan rumah
        Label nameLabel = new Label("Welcome, " + steve.getName() + "!");
        nameLabel.setStyle("-fx-font-size: 24; -fx-text-fill: lime; -fx-font-weight: bold;");

        // StackPane = tumpukan block, tengah-tengah
        StackPane root = new StackPane(nameLabel);
        root.setStyle("-fx-background-color: #87CEEB;"); // Langit Minecraft

        // Scene = chunk ukuran 400x300
        Scene scene = new Scene(root, 400, 300);

        // Stage = jendela utama
        primaryStage.setTitle("Minecraft Character Manager");
        primaryStage.setScene(scene);
        primaryStage.show(); // Buka pintu!
    }

    public static void main(String[] args) {
        launch(args);
    }
}