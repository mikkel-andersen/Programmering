package loopstemplate3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui3 extends Application {

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
//		int x1 = 20; // start point: (x1,y1) int y1 = 200;
//		int y1 = 20;
//		int y2 = 90;
//		while (x1 <= 180) {
//			gc.strokeLine(x1, y1, x1, y2);
//			x1 += 40;
//
//		}
//	}
//---------------------------------------------------------------

//        int x1 = 10; // start point: (x1,y1) int y1 = 200;
//        int x2 = 100;
//        int y1 = 20;
//        int y2 = 20;
//        while (y1 <= 180) {
//            gc.strokeLine(x1, y1, x2, y1);
//            y1 += 40;
//
//        }
//    }

        int x1 = 90;
        int x2 = 110;
        int y1 = 20;
        int y2 = 20;
        while (y1 <= 180) {
            gc.strokeLine(x1, y1, x2, y1);
            y1 += 40;
            x1 -= 20;
            x2 += 20;


        }
    }
}


