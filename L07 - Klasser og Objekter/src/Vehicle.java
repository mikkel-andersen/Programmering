import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


public class Vehicle {

    public static void main(String[] args) {
        Car c1 = new Car(2, 4, Color.CORNFLOWERBLUE);
        Car c2 = new Car();

        System.out.println(c1);
        System.out.println();
        System.out.println(c2);



    }
}
