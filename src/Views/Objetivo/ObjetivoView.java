package Views.Objetivo;

import Views.View;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ObjetivoView extends View {
    public ObjetivoView() {
        try {
            AnchorPane view = FXMLLoader.load(getClass().getResource("/Views/Objetivo/Objetivo.fxml"));
            View.addView(this, view);
        } catch(Exception ex) {
            System.out.println(ex.getCause());
        }
    }
}
