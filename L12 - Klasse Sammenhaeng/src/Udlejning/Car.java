package Udlejning;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;

    public Car(String license, int year) {
        this.license = license;
        this.purchaseYear = year;
    }

    public void setPricePerDay(double price) {
        this.pricePerDay = price;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getLicense() {
        return license;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

}
