package Udlejning;

import java.util.ArrayList;

public class Rental {
    private int number;
    private int days;
    private String date;
    private ArrayList<Car> cars;

    public Rental(int number, int days, String date) {
        this.number = number;
        this.days = days;
        this.date = date;
        cars = new ArrayList<>();
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public int getDays() {
        return days;
    }

    public double getPrice() {
        double price = 0;
        for (Car c : cars) {
           price += c.getPricePerDay();
        }
        price *= getDays();
        return price;
    }

}
