import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception7_2 {
    //2 tane try - catch kullanmistik bi onceki classda, onu 1 try-catch'e indirdik


    public static void main(String[] args) {
        readTextFiles2();
    }


    public static void readTextFiles1() throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/TextFile.txt");

        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }

    }

    public static void readTextFiles2() {

        FileInputStream fis = null;
        int i = 0;

        try {

            fis = new FileInputStream("src/main/java/TextFileMMM.txt"); //If I interrupt the path

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            // throw new RuntimeException(e);
            System.err.println("File doesn't exist or path is wrong...");

        } catch (IOException e) {
            // throw new RuntimeException(e);
            System.err.println("File cannot be read... ");
        } finally {

            try {
                fis.close();

                System.out.println("\n Connection ended...");
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.err.println("File couldn't be closed maybe couldn't be accessed...");
            }
        }
    }
}



