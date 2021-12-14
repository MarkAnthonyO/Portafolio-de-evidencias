package Views.Portada;

import Views.View;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class PortadaView extends View {
    public PortadaView() {
        try {
            AnchorPane view = FXMLLoader.load(getClass().getResource("/Views/Portada/Portada.fxml"));
            View.addView(this, view);
        } catch(Exception ex) {
            System.out.println(ex.getCause());
        }
    }
}
