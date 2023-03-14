import java.util.Scanner;
public class Opgave2_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter driving distance");
        double drivingDistance = in.nextDouble();
        System.out.println("Enter miles per gallon");
        double mPG = in.nextDouble();
        System.out.println("Enter price per gallon");
        double pPG = in.nextDouble();

        double costOfDriving = (drivingDistance / mPG) * pPG;
        System.out.println("The cost of driving is $" + costOfDriving);
    }
}
