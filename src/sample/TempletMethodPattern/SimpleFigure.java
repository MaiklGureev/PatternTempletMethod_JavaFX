package sample.TempletMethodPattern;


import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public abstract class SimpleFigure {

    private Pane mainPane;
    private Shape figure;
    private int radius = 20;
    private Timeline timeline;

    public SimpleFigure(Pane mainPane) {
        this.mainPane = mainPane;
    }

    public void init(){
        figure = new Circle(10, Color.DARKSLATEBLUE);
        mainPane.getChildren().add(figure);
        figure.setLayoutX(mainPane.getWidth()*0.95);
        figure.setLayoutY(mainPane.getHeight()*0.95);
    }


    public void setMoveDuration(){
        timeline = new Timeline(new KeyFrame(Duration.millis(20), new EventHandler<ActionEvent>() {

            Random random = new Random();

            double dx = -2 - random.nextInt(3);//Step on x or velocity
            double dy = -2 - random.nextInt(3);//Step on y

            @Override
            public void handle(ActionEvent t) {
                //move the ball
                figure.setLayoutX(figure.getLayoutX() + dx);
                figure.setLayoutY(figure.getLayoutY() + dy);

                Bounds bounds = mainPane.getBoundsInLocal();

                //If the ball reaches the left or right border make the step negative
                if(figure.getLayoutX() >= (bounds.getMaxX() - radius) ){
                    figure.setLayoutX(bounds.getMaxX()-radius);
                    dx = -dx;
                }else if(figure.getLayoutX() <= (bounds.getMinX() + radius) ){
                    figure.setLayoutX(bounds.getMinX()+radius);
                    dx = -dx;
                }

                //If the ball reaches the bottom or top border make the step negative
                if(figure.getLayoutY() >= (bounds.getMaxY() - radius)){
                    figure.setLayoutY(bounds.getMaxY()-radius);
                    dy = -dy;
                }else if(figure.getLayoutY() <= (bounds.getMinY() + radius)){
                    figure.setLayoutY(bounds.getMinY()+radius);
                    dy = -dy;
                }

            }
        }));
    }

    public void play(){
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    public Shape getFigure() {
        return figure;
    }

    public void setFigure(Shape figure) {
        this.figure = figure;
    }

    public Pane getMainPane() {
        return mainPane;
    }

    public void setMainPane(Pane mainPane) {
        this.mainPane = mainPane;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public Timeline getTimeline() {
        return timeline;
    }
}
