import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opgave4 {


    public static void main(String[] args) {
        String fileName = "/Users/mikkel/desktop/opgave4.txt";
        try {
            PrintWriter printWriter = new PrintWriter(fileName);

            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) {
                    printWriter.println(i);
                }
            }
            printWriter.close();
            System.out.println("Filen er lavet");


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
