import java.util.Scanner;
public class Opgave2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in celsius");
        double celsius = in.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
    }
}
