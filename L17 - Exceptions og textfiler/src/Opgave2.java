import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opgave2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/mikkel/desktop/opgave2.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                int next = Integer.parseInt(scanner.nextLine()) * 2;
                System.out.println(next);
            }
        } catch (IOException e ) {
            System.out.println(e.getMessage());
        }

    }
}
