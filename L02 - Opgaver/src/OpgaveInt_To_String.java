import java.util.Scanner;
public class OpgaveInt_To_String {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println(number + " er positiv");
        } else if (number == 0) {
            System.out.println(number + " er nul");
        } else if (number < 0) {
            System.out.println(number + " er negativt");
        }
    }
}
