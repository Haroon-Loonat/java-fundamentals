import java.util.Scanner;

public class SelectionAndIterators {

    public static void main (String[] args) {

        // Switch-Case
        /*
                Concatenation replaced with text block!
                System.out.println("Select one of the following to test:" +
                "\n 1) While loop" +
                "\n 2) Do-while loop" +
                "\n 3) For loop" +
                "\n 4) For collections loop\n");
        * */
        System.out.println("""
                Select one of the following to test:
                1) While loop
                2) Do-while loop
                3) For loop
                4) For collections loop
                """);
        Scanner scIn = new Scanner(System.in);
        int intInput = scIn.nextInt();
        boolean blFlag = true;

        int intTemp = 20;
        switch(intInput) {
            // While loop
            case 1:
                System.out.println("You have selected the While loop." +
                        "\nSelected Input is " + intInput + ", let us loop:");
                while(blFlag){
                    System.out.println("Test number is currently " + intTemp + ".");
                    intTemp= intTemp - intInput;
                    if (intTemp == 0) {
                        blFlag = false;
                    }
                }
                break;
            // Do-while loop
            case 2:
                System.out.println("You have selected the Do-while loop." +
                        "\nSelected Input is " + intInput + ", let us loop:");
                do {
                    System.out.println("Test number is currently " + intTemp + ".");
                    intTemp= intTemp - intInput;
                    if (intTemp == 0) {
                        blFlag = false;
                    }
                } while(blFlag);

                break;
            // For loop
            case 3:
                System.out.println("You have selected the For loop." +
                        "\nSelected Input is " + intInput + ", let us loop:");
                for (int i = -15; i<intInput ; i = i + intInput) {
                    System.out.println("Test number is currently " + i + ".");
                }
                break;
            // For collections
            case 4:
                System.out.println("You have selected the For collections loop." +
                        "\nShowcasing all args passed:");
                for (String s : args) {
                    System.out.println(s);
                }
                if (args.length == 0) {
                    System.out.println("No args have been passed, therefore it is empty.");
                }
                break;
            default:

                if (intInput == 0) {
                    System.out.println("You have selected " + intInput + "! We are contiuing.");
                } else if (intInput < 0) {
                    System.out.println("You have selected " + intInput + "! We are breaking.");
                    break;
                }
                System.out.println("We are now discontinued :)");

                break;

        }

    }

}