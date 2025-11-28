import java.util.Scanner;
import java.util.Arrays;

public class MethodsAndArrays {

    public static void main (String[] args) {

        // Initalising array
        System.out.println("Please input what size the array should be:");
        Scanner scIn = new Scanner (System.in);
        int intArrSize = scIn.nextInt();
        int[] intArr = new int[intArrSize];
        System.out.println("Array size has been set to value " + intArrSize + ".");
        System.out.println("\nPlease input the integers present in this array:");
        for (int i = 0; i < intArrSize; i++) {
            System.out.println("Enter the value for position " + i + ":");
            int intTempInput = scIn.nextInt();
            intArr[i] = intTempInput;
        }

        // Menu to test some methods with array
        boolean blFlag = true;
        while(blFlag) {
            System.out.println(""" 
                \nSelect an option below:
                1) Display array
                2) Display the first ? numbers in array
                3) Reverse array
                4) Sort array
                5) Quit
                """);
            int intMenu = scIn.nextInt();
            switch (intMenu) {
                case 1:
                    displayArray(intArr);
                    break;
                case 2:
                    System.out.println("Enter the number of indices to display.");
                    int intNum = scIn.nextInt();
                    displayArray(intArr, intNum);
                    break;
                case 3:
                    reverseArray(intArr);
                    displayArray(intArr);
                    break;
                case 4:
                    // Sorting entire array, so start and end indices are fixed
                    Arrays.sort(intArr, 0, intArr.length);
                    displayArray(intArr);
                    break;
                case 5:
                    blFlag = false;
                    break;
                default:
                    break;
            }
        }

    }

    // Display method of array
    private static void displayArray(int[] intArr) {
        System.out.println("Array has the following values:");
        System.out.print(intArr[0]);
        for (int i = 1; i < intArr.length; i++) {
            System.out.print(", " + intArr[i] );
        }
    }

    // Overloaded display method of array
    private static void displayArray(int[] intArr, int intNum) {

        System.out.println("Array has the following values for the first " + intNum + " indices:");

        if (intNum == 1) {
            System.out.print(intArr[0]);
        } else {
            System.out.print(intArr[0]);
            for (int i = 1; i < intNum; i++) {
                System.out.print(", " + intArr[i] );

            }
        }
    }

    // Reversal method of array
    private static void reverseArray (int[] intArr) {
        int[] intTempArr = intArr.clone();

        for (int i = 1; i <= intArr.length; i ++) {
            intArr[i - 1] = intTempArr[intArr.length - i];
        }
    }

}