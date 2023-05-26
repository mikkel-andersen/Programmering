import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Opgave6 {
    public static void main(String[] args) throws IOException {
        String filename = "/Users/mikkel/desktop/opgave6.txt";
        System.out.println(max(filename));
        System.out.println(min(filename));
        System.out.println(average(filename));

    }

    public static int max(String fileName) throws IOException {
        int max = Integer.MIN_VALUE;
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            int t = Integer.parseInt(scanner.nextLine());
            if (t > max) {
                max = t;
            }
        }
        scanner.close();
        return max;
    }

    public static int min(String fileName) throws IOException {
        int min = Integer.MAX_VALUE;
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            int t = Integer.parseInt(scanner.nextLine());
            if (t < min) {
                min = t;
            }
        }
        scanner.close();
        return min;
    }

    public static double average(String fileName) throws IOException {
        double average = 0;
        int count = 0;
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            double t = Integer.parseInt(scanner.nextLine());
            average += t;
            count++;
        }
        scanner.close();
        return average / count;
    }


}
