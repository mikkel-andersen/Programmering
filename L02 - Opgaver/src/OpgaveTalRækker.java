import java.util.Scanner;
public class OpgaveTalRækker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast et tal: ");
        int n1 = input.nextInt();
        System.out.println("Indtast et tal: ");
        int n2 = input.nextInt();
        System.out.println("Indtast et tal: ");
        int n3 = input.nextInt();

        if (n1 < n2 && n2 < n3) {
                System.out.println(n1 + " " + n2 + " " + n3 + " er voksende");
        } else if (n1 > n2 && n2 > n3) {
                System.out.println(n3 + " " + n2 + " " + n1 + " er aftagende");
        } else if (n1 < n2 && n2 > n3) {
                System.out.println(n1 + " " + n2 + " " + n3 + " er hverken eller");
        }
    }
}
