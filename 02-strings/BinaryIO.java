import java.io.*;

public class BinaryIO {

    public static void main (String[] args) {

        // Reading from binary files

        // Reading data
        // declare dis - use fis to get file - use bufis with fis - can now use dis with bufis to read
        DataInputStream dis = null;

        try {
            FileInputStream fis = new FileInputStream("02-strings/docs/binaryReadWrite.dat");
            BufferedInputStream bufis = new BufferedInputStream(fis);
            dis = new DataInputStream(bufis);
            String strTest = dis.readUTF();
            System.out.println(strTest);
        } catch (FileNotFoundException ex) {
            System.out.println("Failed to read - possible file path issue.");
        } catch (IOException ex) {
            System.out.println("Failed to read.");
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException ex) {
                    System.out.println("Failed to close");
                }
            }
        }

        // Reading objects
        // declare ois - use fis to get file - use bufis with fis - can now use ois with bufis to read (cast/check instance of to use)
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream("02-strings/docs/binaryReadWriteObj.dat");
            BufferedInputStream bufis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bufis);
            String[] arr = (String[]) ois.readObject();
            for(int i = 0; i < arr.length; i ++) {
                System.out.println(arr[i]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failed to read - possible file path issue.");
        } catch (IOException ex) {
            System.out.println("Failed to read.");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Failed to read - class not found.");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    System.out.println("Failed to close");
                }
            }
        }

        // Writing to binary files

        // Writing data
        // Declare dos - use fos to get file - use bufos with fos - can now use dos with bufos to write
        DataOutputStream dos = null;

        try
        {
            FileOutputStream fos = new FileOutputStream("02-strings/docs/binaryReadWrite.dat");
            BufferedOutputStream bufos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bufos);
            dos.writeUTF("Hello World");
        } catch (FileNotFoundException ex) {
            System.out.println("Failed to write - possible file path issue.");
        } catch (IOException ex) {
            System.out.println("Failed to write.");
        } finally {
            if (dos != null) {
                try {
                   dos.close();
                } catch (IOException ex) {
                    System.out.println("Failed to close");
                }
            }
        }

        // Writing objects
        // Declare oos - use fos to get file - use bufos with fos - can now use oos with bufos to write
        ObjectOutputStream oos = null;

        try
        {
            FileOutputStream fos = new FileOutputStream("02-strings/docs/binaryReadWriteObj.dat");
            BufferedOutputStream bufos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bufos);
            String[] strArr = {"Hello", "World", "Of", "Arrays"};
            oos.writeObject(strArr);
        } catch (FileNotFoundException ex) {
            System.out.println("Failed to write - possible file path issue.");
        } catch (IOException ex) {
            System.out.println("Failed to write.");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    System.out.println("Failed to close");
                }
            }
        }

        // ARM has been ignored for simplicity purposes

    }

}