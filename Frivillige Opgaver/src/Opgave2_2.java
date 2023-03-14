import java.util.Scanner;
import java.lang.Math;
public class Opgave2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Enter the values of radius and length
        System.out.println("Enter radius of cylinder");
        double radius = in.nextDouble();
        System.out.println("Enter length of cylinder");
        double length = in.nextDouble();

        //Math.PI is an import to get the value of pi
        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
