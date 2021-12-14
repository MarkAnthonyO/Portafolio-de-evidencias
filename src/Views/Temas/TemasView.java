package Views.Temas;

import Views.View;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class TemasView extends View {
    public TemasView() {
        try {
            AnchorPane view = FXMLLoader.load(getClass().getResource("/Views/Temas/Temas.fxml"));
            View.addView(this, view);
        }catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}
