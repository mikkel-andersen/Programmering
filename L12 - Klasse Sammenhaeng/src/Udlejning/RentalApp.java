package Udlejning;

public class RentalApp {

    public static void main(String[] args) {
        Rental r1 = new Rental(10, 32, "Monday");
        Rental r2 = new Rental(5, 7, "Tuesday");

        Car c1 = new Car("Abc", 2015);
        Car c2 = new Car("BCC", 2011);
        Car c3 = new Car("COC", 2018);
        Car c4 = new Car("FIT", 2019);
        Car c5 = new Car("NESS", 2008);

        c1.setPricePerDay(920.3);
        c2.setPricePerDay(829.95);
        c3.setPricePerDay(750.8);
        c4.setPricePerDay(999.2);
        c5.setPricePerDay(320.50);

        r1.addCar(c1); r1.addCar(c2); r1.addCar(c5);
        r2.addCar(c3); r2.addCar(c4);

        System.out.println("Total pris for alle udlejninger i " + r1.getDays() + " dage er: " + r1.getPrice() + " kr");
        System.out.println("Total pris for alle udlejninger i " + r2.getDays() + " dage er: " + r2.getPrice() + " kr");

    }
    
    
}
