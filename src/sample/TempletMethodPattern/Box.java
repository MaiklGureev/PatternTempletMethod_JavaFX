package sample.TempletMethodPattern;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Box extends SimpleFigure{

    Polygon figure;

    public Box(Pane mainPane) {
        super(mainPane);
    }

    @Override
    public void init() {
        figure = new Polygon();
        figure.getPoints().addAll(new Double[]{
                0.0, 20.0,
                20.0, 20.0,
                20.0, 0.0,
                0.0, 0.0,
        });
        figure.fillProperty().setValue(Color.RED);

        figure.setLayoutX(super.getMainPane().getWidth()*0.95);
        figure.setLayoutY(super.getMainPane().getHeight()*0.95);

        super.setRadius(30);
        super.getMainPane().getChildren().add(figure);
        super.setFigure(figure);
    }

}
