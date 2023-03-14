import javafx.scene.paint.Color;

public class Car {

    private int doors;
    private int wheels;
    private Color color;

    public Car(int doors, int wheels, Color color) {
        this.doors = doors;
        this.wheels = wheels;
        this.color = color;
    }

    public Car() {
        this.doors = 1;
        this.color = Color.RED;
        this.wheels = 3;
    }

    @Override
    public String toString() {
        return color + " vehicle with " + doors + " doors and " + wheels + " wheels";
    }

    public Color getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }



}

