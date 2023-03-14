
public class Opgave5_3 {

    public static String conversion() {
        double kg = 1;
        double pounds = 0;
        System.out.println("Kilogram            Pounds");
        while (kg < 200) {
            pounds = kg * 2.2;
            System.out.println(kg + "                 "  + pounds);
            kg++;
        }
        return null;
    }
    public static void main(String[] args) {
            conversion();

        }

    }
