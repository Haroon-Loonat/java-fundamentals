import java.util.Scanner;

public class InputOutputDemo {

    public static void main (String[] args) {

        // Basic output
        System.out.println("Basic output test.\n");

        // Basic input
        System.out.println("Basic input test.\nEnter a phrase:");
        Scanner scIn = new Scanner(System.in);
        String strIn = scIn.nextLine();
        System.out.println("You have entered " + strIn + "\n");

        // Formatted output
        System.out.println("Enter a decimal number:");
        float fltTest = scIn.nextFloat();
        System.out.printf("Formatting number to decimal with 2 points -> %.2f%n", fltTest);
        System.out.printf("Formatting number to scientific notation -> %e", fltTest);

        System.out.println("\nEnd of \"InputOutputDemo.java\"\n");

    }

}