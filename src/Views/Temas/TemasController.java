package Views.Temas;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class TemasController implements Initializable {
    @FXML
    Label title;
    @FXML
    WebView view;
    WebEngine engine;

    @FXML
    Button btnA;
    @FXML
    Button btnS;
    @FXML
    Button btnR;

    String loader = "https://drive.google.com/viewerng/viewer?embedded=true&url="; //https://drive.google.com/viewerng/viewer?url=

    String[] pdfs = {
            "https://markanthonyo.github.io/src/Cuadro%20sinoptico.pdf",
            "https://markanthonyo.github.io/src/Infografia.pdf",
            "https://markanthonyo.github.io/src/Mapa%20mental.pdf",
            "https://markanthonyo.github.io/src/Presentacion.pdf",
            "https://markanthonyo.github.io/src/Resumen%202.pdf",
            "https://markanthonyo.github.io/src/Resumen.pdf"
    };

    int i = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine = view.getEngine();
        engine.javaScriptEnabledProperty().setValue(true);

        engine.locationProperty().addListener((observable, oldValue, newValue) -> {
            if (i < 1) {
                deactivateBtnA();
            } else {
                activateBtnA();
            }

            if (i > 4) {
                deactivateBtnS();
            } else {
                activateBtnS();
            }
        });

        engine.load(loader + pdfs[i]);
        deactivateBtnA();

        btnA.setOnMouseClicked(e -> {
            i--;
            engine.load(loader + pdfs[i]);
        });

        btnS.setOnMouseClicked(e -> {
            i++;
            engine.load(loader + pdfs[i]);
        });

        btnR.setOnMouseClicked(e -> {
            i = 0;
            engine.load(loader + pdfs[i]);
        });
    }

    public void deactivateBtnA() {
        btnA.setDisable(true);
    }

    public void activateBtnA() {
        btnA.setDisable(false);
    }

    public void deactivateBtnS() {
        btnS.setDisable(true);
    }

    public void activateBtnS() {
        btnS.setDisable(false);
    }
}
