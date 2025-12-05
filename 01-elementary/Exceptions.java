import java.util.Scanner;

public class Exceptions {

    public static void main (String[] args ) {

        boolean blMenu = true;
        while(blMenu) {

            System.out.println("""
                \nTesting different methods of handling out of bounds exception.
                Array initialised to [1, 2, 3] and attempt to index at user input.
                
                Select an option from below:
                
                1) Test using try-catch block
                2) Test method by passing to caller (let 'main' handle it)
                3) Test extra operations before rethrowing
                """);

            Scanner scIn = new Scanner(System.in);
            int intMenu = scIn.nextInt();

            int[] intArr = {1, 2, 3};
            System.out.println("Enter an index to test for:");
            int intIndex = scIn.nextInt();

            switch(intMenu) {
                // using try catch
                case 1:
                    try{
                        System.out.println(intArr[intIndex]);
                    } catch(IndexOutOfBoundsException ex) {
                        System.out.println("Index out of bounds exception caught for accessing index " + intIndex + ".");
                    }
                    break;

                // passing to caller of function
                case 2:
                    try{
                        System.out.println(indexArray1(intIndex, intArr));
                    } catch(IndexOutOfBoundsException ex) {
                        System.out.println("Index out of bounds exception caught for accessing index " + intIndex + " in main.");
                    }
                    break;

                // extra operations before rethrowing
                // -- you catch in method, do something, then you pass to caller and handle it
                case 3:
                    try {
                        System.out.println(indexArray2(intIndex, intArr));
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Index out of bounds exception caught for accessing index " + intIndex + " in main.");

                    } break;

                default:
                    break;
            }

           if(intIndex == 0) {
               blMenu = false;
           }
       }

    }
    // DISCLAIMER!!!!! THIS APPROACH SHOULD NOT BE USED FOR METHODS WHICH CAN CAUSE EXCEPTION IN MAIN!!! THIS IS FOR DEMO!!!
    private static int indexArray1(int intIndex, int[] intArr) throws IndexOutOfBoundsException{
        return intArr[intIndex];
    }

    private static int indexArray2(int intIndex, int[] intArr) throws IndexOutOfBoundsException{
        try{
            return intArr[intIndex];
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Index out of bounds exception caught for accessing index " + intIndex);
            throw ex;
        }
    }

}