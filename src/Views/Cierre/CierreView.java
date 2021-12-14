package Views.Cierre;

import Views.View;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class CierreView extends View {
    public CierreView() {
        try {
            AnchorPane view = FXMLLoader.load(getClass().getResource("/Views/Cierre/Cierre.fxml"));
            View.addView(this, view);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}
