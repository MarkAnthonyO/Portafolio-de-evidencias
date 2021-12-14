package Views;

import javafx.scene.layout.AnchorPane;

public class View extends AnchorPane {

    public static void addViews(AnchorPane panel, AnchorPane[] views) {
        for(int i = 0; i < views.length; i++) {
            panel.setTopAnchor(views[i], 0.0);
            panel.setLeftAnchor(views[i], 0.0);
            panel.setRightAnchor(views[i], 0.0);
            panel.setBottomAnchor(views[i], 0.0);
            panel.getChildren().add(views[i]);
        }
    }

    public static void addView(AnchorPane panel, AnchorPane view) {
        panel.setTopAnchor(view, 0.0);
        panel.setLeftAnchor(view, 0.0);
        panel.setRightAnchor(view, 0.0);
        panel.setBottomAnchor(view, 0.0);
        panel.getChildren().add(view);
    }

    public static void activeView(AnchorPane view) {
        view.setVisible(true);
    }

    public static void deactivateView(AnchorPane[] views) {
        for(int i = 0; i < views.length; i++) views[i].setVisible(false);
    }
}
