package Views.Main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class MainView extends AnchorPane {
    public MainView() {
        try {
            AnchorPane view = FXMLLoader.load(getClass().getResource("/Views/Main/Main.fxml"));
            getChildren().add(view);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}
