package model;

public class ChildApp {

   // Metoden skal returenre en tekststreng der beskriver hvilken institution et barn skal gå i, afhængig af barnets alder.
   // Reglerne for dette kan ses på opgavedsedlen

    public static String institution(int age) {
        if (age == 0) {
            return "Home";
        } else if (age <=2) {
            return "Nusery";
        } else if (age <= 5) {
            return "Kindergarten";
        } else if (age <= 16) {
            return "School";
        } else if (age > 16) {
            return "Out of shool";
        }
        return null;
    }


    // Metoden skal returenre en tekststreng der beskriver hvilket gymnastikhold et barn skal gå på, afhængig af barnets alder og køn.
    // Reglerne for dette kan ses på opgavedsedlen
    public static String team(boolean isBoy, int age) {
        if(isBoy == true && age >= 8) {
            return "Cool boys";
        } else if (isBoy == true && age < 8) {
            return "Young cubs";
        } else if (isBoy == false && age >= 8) {
            return "Springy girls";
        } else if (isBoy == false && age < 8) {
            return "Tumbling girls";
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println("Et barn på 5 skal i " + institution(1));
        System.out.println("En dreng på 8 skal i " + team(true,8));
        System.out.println("En teenager på 17 skal i " + institution(17));
        System.out.println("En pige på 8 skal i " + team(false,8));

    }
}
