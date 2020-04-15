package sample;


import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import sample.TempletMethodPattern.Ball;
import sample.TempletMethodPattern.Box;
import sample.TempletMethodPattern.SimpleFigure;
import sample.TempletMethodPattern.Star;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addCircleButton;

    @FXML
    private Button addBoxButton;

    @FXML
    private Button addStarButton;

    @FXML
    private Button closeButton;

    @FXML
    private Pane mainPane;

    @FXML
    void closeAplication(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

    @FXML
    void createBox(ActionEvent event) {
        SimpleFigure box = new Box(mainPane);
        box.init();
        box.setMoveDuration();
        box.play();

    }

    @FXML
    void createCircle(ActionEvent event) {
        SimpleFigure ball = new Ball(mainPane);
        ball.init();
        ball.setMoveDuration();
        ball.play();
    }

    @FXML
    void createStar(ActionEvent event) {
        SimpleFigure star = new Star(mainPane);
        star.init();
        star.setMoveDuration();
        star.play();
    }

    @FXML
    void initialize() {
        assert addCircleButton != null : "fx:id=\"addCircleButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert addBoxButton != null : "fx:id=\"addBoxButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert addStarButton != null : "fx:id=\"addStarButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert closeButton != null : "fx:id=\"closeButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert mainPane != null : "fx:id=\"mainPane\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
