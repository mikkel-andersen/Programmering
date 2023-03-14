package loopstemplate4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui4 extends Application {

    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
//        int x = 100; // center: (x,y) int y = 100;
//        int y = 100;
//        int r = 30; // radius: r while (x <= 150) {
//        while (r <= 180) {
//            gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
//            r += 40;
//        }

        int x = 75; // center: (x,y)
        int y = 100;
        int r = 100; // radius: r
        while (r <= 180) {
            gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
            x = r;
            r += 25;
        }

    }

}

