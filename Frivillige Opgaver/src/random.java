import java.util.*;
public class random {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int max = input.nextInt(); // 1 -> x
        int printTimes= input.nextInt();

        for (int i = 0; i < printTimes; i++) {
            System.out.println(random.nextInt(max)+1);
        }




    }


}
