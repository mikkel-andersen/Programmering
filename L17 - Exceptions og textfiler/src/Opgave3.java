import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {
        File file = new File("/Users/mikkel/desktop/opgave2.txt");
        ArrayList<Integer> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                int next = Integer.parseInt(scanner.nextLine());
                list.add(next);
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
