import java.util.Scanner;

public class Opgave6_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sales amount: ");

        double sale = input.nextDouble();
        System.out.println("Sales amount            Commission");
        System.out.println("----------------------------------");
        //System.out.println( sale + "                   " + computeCommission(sale));
        System.out.println(computeCommission(1000));

    }

    public static double computeCommission(double salesAmount) {
        double sale = salesAmount;
        double commission;


        while (sale <= 20000) {

            if (sale >= 0.01 && sale <= 5000) {
                commission = sale * 0.08;
                System.out.println(sale + "                 " + commission);

            } else if (sale >= 5000.01 && sale <= 10000) {
                commission = sale * 0.1;
                System.out.println(sale + "                 " + commission);

            } else {
                commission = sale * 0.12;
                System.out.println(sale + "                 " + commission);
            }
            sale += 1000;
        }
        return 0;
    }


}
