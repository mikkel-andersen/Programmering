import java.util.Scanner;
public class OpgaveÅrstider {

    public static String Season(int day, int month) {

        String result ="";
        if (month <= 3){
            result = "Vinter";
        }
        else if (month <= 6){
            result = "Forår";
        }
        else if (month <= 9){
            result = "Sommer";
        }
        else if (month <= 12){
            result = "Efterår";
        }
        if (month % 3 == 0 && day >= 21 && result.equals("Vinter")){
            result = "Forår";
        }
        if (month % 3 == 0 && day >= 21 && result.equals("Forår")){
            result = "Sommer";
        }
        if (month % 3 == 0 && day >= 21 && result.equals("Sommer")){
            result = "Efterår";
        }
        if (month % 3 == 0 && day >= 21 && result.equals("Efterår")){
            result = "Vinter";
        }

        return null;
    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Vælg et tal mellem 1 - 31: ");
        int day = input.nextInt();

        System.out.println("Vælg et tal mellem 1 - 12: ");
        int month = input.nextInt();

        System.out.println(Season(day, month));
        System.out.println(Season(31, 1));


        }


    }


