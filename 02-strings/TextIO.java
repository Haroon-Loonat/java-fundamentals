import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class TextIO {

    public static void main (String[] args) {

        // Reading from text file
        // Get the file - use scanner to get contents

        File txtFile1 = new File("02-strings/docs/readFrmMe.txt");

        Scanner scIn = null;
        try{
            scIn = new Scanner(txtFile1);
            while(scIn.hasNext()){
                System.out.println(scIn.nextLine());
            }
        } catch (FileNotFoundException ex){
            System.out.println("File has not been found - check path.");
        } finally {
            if (scIn != null) {
                scIn.close();
            }
        }

        // Writing to text file
        // Get the file - use PrintWriter to write to file
        File txtFile2 = new File("02-strings/docs/write2me.txt");

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(txtFile2);
            pw.println("Hello World");
        } catch (FileNotFoundException e) {
            System.out.println("Failed to write.");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }

        // This is basic writing to file - does not append rather overwrites
        // ARM has been ignored for simplicity purposes

    }

}