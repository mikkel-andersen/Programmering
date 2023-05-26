import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opgave5 {

    public static void main(String[] args) {
        String fileName = "/Users/mikkel/desktop/opgave5.txt";
        Scanner scanner = new Scanner(System.in);
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            int t;
            System.out.println("indtast første tal");
            t = scanner.nextInt();
            while (t != -1) {
                printWriter.println(t);
                System.out.println("Indtast næste tal - (-1 for at slutte)");
                t = scanner.nextInt();
            }
            scanner.close();
            printWriter.close();
            System.out.println("File created");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
