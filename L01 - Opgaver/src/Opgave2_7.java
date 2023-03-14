import java.util.Scanner;

public class Opgave2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter minutes here");
        int minutes = in.nextInt();


        int minutesPerDay = 60 * 24; // 60 minutes in an hour and 24 hours in a day
        int minutesPerYear = minutesPerDay * 365; // 365 days in a year
        int remainder = minutes % minutesPerYear; // store the remaining minutes in remainder

        int years = minutes / minutesPerYear; // compute years from the given amount of minutes
        int days = remainder / minutesPerDay; // compute the days from the left over minutes
        System.out.println(minutes + " minutes is approximately " + years + " year(s) and " + days + " days");

    }
}
