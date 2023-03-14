import java.util.Scanner;

public class OpgaveInt_to_String_opg6 {

        public static String sign(int number) {
            if (number > 0) {
                return number + " er positiv";
            } else if (number == 0) {
                return number + " er nul";
            } else if (number < 0) {
                return number + " er negativt";
            }
            return null;
        }
        public static void main(String[] args) {
            System.out.println(sign(3));
            System.out.println(sign(-1));
            System.out.println(sign(1));
            System.out.println(sign(0));
        }
    }

