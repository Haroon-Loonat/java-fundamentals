import java.awt.*;
import java.util.StringTokenizer;

public class Basics {

    public static void main(String[] args) {

        // Creation of Strings
        String strOne = new String("Literal String - 1");
        String strTwo = "Literal String - 2";
        String[] strSequence = {"Hello", "World"};

        System.out.println(strOne);
        System.out.println(strTwo);
        for (int i = 0; i < strSequence.length; i++) {
            System.out.println(strSequence[i]);
        }

        // Interned Strings
        String strInOne = "Test";
        String strInTwo = new String("Test");
        String strInThree = "Test";

        if (strInOne.equals(strInTwo)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (strInOne.equals(strInThree)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // Note - The actual String is equal BUT the String reference for strInOne and strInTwo is different.
        // Using 'new' causes another reference of the string to be used rather than saving on memory.

        // Some String methods
        String strMethodTest = "This is THE END OF the WoRlD!";
        System.out.println(strMethodTest);
        System.out.println(strMethodTest.toUpperCase());
        System.out.println(strMethodTest.charAt(2));

        // Mutable Strings
        // String Builder - fast but NOT thread safe
        StringBuilder strBuild = new StringBuilder("Testing");
        strBuild.append(" Builder");
        System.out.println(strBuild);
        // String Buffer - slow but IS thread safe
        StringBuffer strBuff = new StringBuffer("Testing");
        strBuff.append(" Buffer");
        System.out.println(strBuff);

        // String Tokenizer
        String strTesterString = "John Doe Programmer";
        StringTokenizer stringTokenizer = new StringTokenizer(strTesterString, " ");
        String strFirstName = stringTokenizer.nextToken();
        String strLastName = stringTokenizer.nextToken();
        String strJob = stringTokenizer.nextToken();
        System.out.println(strFirstName);
        System.out.println(strLastName);
        System.out.println(strJob);

    }

}