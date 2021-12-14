package Views.Main;

import Views.Cierre.CierreView;
import Views.Intro.IntroView;
import Views.Objetivo.ObjetivoView;
import Views.Portada.PortadaView;
import Views.Temas.TemasView;
import Views.View;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    PortadaView portada = new PortadaView();
    IntroView intro = new IntroView();
    ObjetivoView objetivo = new ObjetivoView();
    CierreView cierre = new CierreView();
    TemasView temas = new TemasView();

    View[] views = {
            portada, intro, objetivo, cierre, temas
    };

    @FXML
    Button btnPortada;
    @FXML
    Button btnIntro;
    @FXML
    Button btnObjetivo;
    @FXML
    Button btnTemas;
    @FXML
    Button btnCierre;

    @FXML
    AnchorPane container;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        View.addViews(container, views);
        View.deactivateView(views);
        View.activeView(portada);

        btnPortada.setOnMouseClicked(e -> {
            View.deactivateView(views);
            View.activeView(portada);
        });

        btnIntro.setOnMouseClicked(e -> {
            View.deactivateView(views);
            View.activeView(intro);
        });

        btnObjetivo.setOnMouseClicked(e -> {
            View.deactivateView(views);
            View.activeView(objetivo);
        });

        btnTemas.setOnMouseClicked(e -> {
            View.deactivateView(views);
            View.activeView(temas);
        });

        btnCierre.setOnMouseClicked(e -> {
            View.deactivateView(views);
            View.activeView(cierre);
        });

    }
}
