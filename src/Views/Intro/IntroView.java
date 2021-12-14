package Views.Intro;

import Views.View;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class IntroView extends View {
    public IntroView() {
        try {
            AnchorPane view = FXMLLoader.load(getClass().getResource("/Views/Intro/Intro.fxml"));
            View.addView(this, view);
        } catch(Exception ex) {
            System.out.println(ex.getCause());
        }
    }
}
