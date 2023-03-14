package example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        this.initContent(pane);
        Scene scene = new Scene(pane, 400, 400);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(Pane pane) {

        // Opgave 1 & 2
//        int x = 100;
//        Paint p = Color.YELLOW;
//        Circle circle = new Circle(70 + x, 70, 30);
//        Rectangle rectangle = new Rectangle(10 + x, 30, 30, 30);
//        Line line = new Line(10 + x, 10, 120 + x, 300);
//        pane.getChildren().add(circle);
//        pane.getChildren().add(rectangle);
//        pane.getChildren().add(line);
//        circle.setFill(p);
//        circle.setStroke(Color.BLACK);
//        rectangle.setFill(p);
//        rectangle.setStroke(Color.BLACK);
//        line.setFill(p);
//        line.setStroke(Color.BLACK);

        //Opgave 3
//        Rectangle rectangle = new Rectangle(50, 250, 120, 120);
//        Rectangle rectangle1 = new Rectangle(70, 275, 30,30);
//        Polygon polygon = new Polygon(30, 250, 190, 250, 110, 180);
//        Rectangle rectangle2 = new Rectangle(120, 290, 30, 80);
//        Circle circle = new Circle(210, 170, 40, Color.YELLOW);
//        Line line = new Line(30, 370, 370, 370);
//        pane.getChildren().add(line);
//
//        pane.getChildren().add(polygon);
//        pane.getChildren().add(rectangle);
//        pane.getChildren().add(rectangle1);
//        pane.getChildren().add(rectangle2);
//        pane.getChildren().add(circle);
//        rectangle2.setFill(Color.SADDLEBROWN);
//        circle.setStroke(Color.BLACK);
//        line.setStroke(Color.BLACK);
//        rectangle.setFill(Color.RED);
//        rectangle1.setFill(Color.BLACK);
//        polygon.setFill(Color.GREEN);

        // Opgave 4

        int numberOfWheels = 2;
        int numberOfDoors = 4;

        Rectangle rectangle = new Rectangle(50,100, 225,75);
        Polygon polygon = new Polygon(50, 100, 50, 50, 100, 100);
        Circle c1 = new Circle( 80,175, 25);
        Circle c2 = new Circle( 250,175, 25);
        Circle c3 = new Circle( 140,175, 25);
        Circle c4 = new Circle( 190,175, 25);
        Rectangle d1 = new Rectangle(70, 110, 20, 65);
        Rectangle d2 = new Rectangle(130, 110, 20, 65);
        Rectangle d3 = new Rectangle(200, 110, 20, 65);
        Rectangle d4 = new Rectangle(250, 110, 20, 65);
        Rectangle u = new Rectangle(40, 150, 50 , 15 );
        pane.getChildren().add(u);
        u.setFill(Color.GREY);

        for (int i = 1; i <= numberOfWheels; i++) {
            if (i == 1) {
                pane.getChildren().add(c1);
            } else if (i == 2) {
                pane.getChildren().add(c2);
            } else if (i == 3) {
                pane.getChildren().add(c3);
            } else if (i == 4) {
                pane.getChildren().add(c4);
            }
        }


        pane.getChildren().add(polygon);
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.CORNFLOWERBLUE);

        d1.setFill(Color.ROYALBLUE);
        d2.setFill(Color.ROYALBLUE);
        d3.setFill(Color.ROYALBLUE);
        d4.setFill(Color.ROYALBLUE);

        for (int i = 1; i <= numberOfDoors; i++) {
            if (i == 1) {
                pane.getChildren().add(d1);
            } else if (i == 2) {
                pane.getChildren().add(d2);
            } else if (i == 3) {
                pane.getChildren().add(d3);
            } else if (i == 4) {
                pane.getChildren().add(d4);
            }
        }








    }
}
