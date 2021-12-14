package Main;

import Views.Main.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new MainView(), 1280, 720);

        Image img = new Image(getClass().getResource("/icono.png").toString());

        stage.setTitle("Proyecto");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.resizableProperty().setValue(false);
        stage.getIcons().add(img);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
