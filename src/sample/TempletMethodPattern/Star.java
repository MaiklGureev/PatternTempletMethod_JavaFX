package sample.TempletMethodPattern;

import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class Star extends SimpleFigure {



    Polygon figure;

    public Star(Pane mainPane) {
        super(mainPane);
    }

    @Override
    public void init() {
        figure = new Polygon();
        figure.getPoints().addAll(new Double[]{
                0.0, 8.0,
                2.5, 3.5,
                7.5, 2.5,
                4.0, -1.0,
                5.0, -6.0,
                0.0, -4.0,
                -5.0, -6.0,
                -4.0, -1.0,
                -7.5, 2.5,
                -2.5, 3.5,
        });
        figure.setScaleX(2);
        figure.setScaleY(2);
        figure.fillProperty().setValue(Color.YELLOW);
        figure.setLayoutX(getMainPane().getWidth()*0.93);
        figure.setLayoutY(getMainPane().getHeight()*0.93);

        super.setRadius(40);
        super.getMainPane().getChildren().add(figure);
        super.setFigure(figure);
    }


}
