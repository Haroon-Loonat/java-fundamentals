import java.util.Scanner;
import java.time.LocalDate;

public class ConditionalStatements {

    public static void main (String[] args) {

        // Getting input casting to lower case
        System.out.println("Are you over the age of 21? Enter 'y' for yes, 'n' for no OR click any other key to quit:");
        Scanner scIn = new Scanner(System.in);
        String strIn = scIn.next();

        // Ensure input is a character
        if (strIn.length() != 1) {
            System.out.print("You have not entered a character. Exiting now.");
            return;
        }

        // Ensuring input works for both cases
        char chAge = strIn.charAt(0);
        chAge = Character.toLowerCase(chAge);

        // Grant access if yes, reject if no, otherwise quit
        if (chAge == 'y') {

            // Verify age based on birth year
            System.out.println("Verification is required!\nWhat year were you born in? (enter only 4 digits) ");
            int intYear = scIn.nextInt();
            LocalDate now = LocalDate.now();
            int intAgeAssumption = now.getYear() - intYear;

            if (intAgeAssumption > 21) {
                System.out.println("Verified - you may proceed.");
            } else {
                System.out.println("You are a LIAR!");
            }

        } else if (chAge == 'n'){
            System.out.print("You are not allowed entry to the pub, come back when you are older.");
        } else {
            System.out.print("You have not entered 'y' or 'n'. Exiting now.");
        }

    }

}