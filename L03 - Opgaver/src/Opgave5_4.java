public class Opgave5_4 {

    public static String conversion() {
        double miles = 1;
        double kilometers = 0;
        System.out.println("Kilogram            Pounds");
        while (miles <= 10) {
            kilometers = miles * 1.609;
            System.out.println(miles + "                 "  + kilometers);
            miles++;
        }
        return null;
    }
    public static void main(String[] args) {
        conversion();

    }

}
