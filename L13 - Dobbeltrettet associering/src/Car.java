import java.util.ArrayList;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;
    private ArrayList<Rental> rentals;

    public Car(String license, int year) {
        this.license = license;
        this.purchaseYear = year;
        rentals = new ArrayList<>();
    }

    public void setPricePerDay(double price) {
        this.pricePerDay = price;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void addRental(Rental r) {
        if (!rentals.contains(r)) {
            rentals.add(r);
        }

    }

    public void removeRental(Rental r) {
        if (rentals.contains(r)) {
            rentals.remove(r);
            r.addCar(this);
        }

    }

    public String getLicense() {
        return license;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

}
