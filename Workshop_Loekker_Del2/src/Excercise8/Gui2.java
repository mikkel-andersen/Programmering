package Excercise8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui2 extends Application {

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
//		int x1 = 16;
//		int x2 = 16;
//		int y1 = 80;
//		int y2 = 160;
//
//		for (int i = 0; i <= 10; i++) {
//			gc.strokeLine(x1, y1, x2, y2);
//			x1 += 16;
//			x2 += 16;
//			y1 -= 4;
//			y2 -= 12;
//		}

        double y1 = 0.0;
        double y0 = 60;
        double y2 = 0.0;

        for (double x1 = 180; x1 > 5; x1 *= 0.75) {
            y1 = y0 - x1 * 0.2;
            y2 = y0 + x1 * 0.5;
            gc.strokeLine(x1, y1, x1, y2);
        }
    }
}
