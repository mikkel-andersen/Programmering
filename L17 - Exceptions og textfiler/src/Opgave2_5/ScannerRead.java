package Opgave2_5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerRead {

    public static void main(String[] args) {

        File filein = new File("/Users/mikkel/desktop/opgave2.txt");

        try {
            Scanner scan = new Scanner(filein);
            while (scan.hasNext()) {
                int next = Integer.parseInt(scan.nextLine()) * 2;
                System.out.println(next);
            }
			scan.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
