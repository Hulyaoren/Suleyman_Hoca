import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
    If I say you "read the book that's in my room", you come to me with 3 concerns;
        1)Where is the room(if the path you say is not correct)
        2)Where is the book in your room?(IF it is not there)
        3)If the book is in Chinese??
 */
/*
      1) If you get red underline while you type, it can be "checked(compile time exception"
      2) Most common checked exceptions are:
            i) File not found exception ("path issue" or "existence of file")
            ii) IOException: related with all "Input and Output issues"
            iii) IOException is parent of fileNotFound Exception,
                 If you use IOException, no need to use fileNotFound Exception
                 But if you insist, "FileNotFound Exception" must be in the first catch block
 */

public class Exception7 {
    public static void main(String[] args) throws IOException { //  if any method throws checked exception you should handle it in main method

        readTextFiles2();
    }


    public static void readTextFiles1() throws IOException { //FileInputStream: is a class in Java, there are many methods in it to access files
        //There are 2 ways, we choosed first one, throw exception

        FileInputStream fis = new FileInputStream("src/main/java/TextFile.txt");     //throws exeption here; compile time exception; FileNotFoundException

        //we created an object to use the methods in FileInputStream class
        //Constructor of "FileInputStream" can work with the address of the file

        int i = 0;
        while ((i = fis.read()) != -1) { //read method gives exception again, if the file is empty or Chinese again
            //when we handle it, "FileNotFoundException" converted to "IOException" (which is parent of FileNotFoundException)
            System.out.print((char) i);
        }
        fis.close();// disconnects app from file because *someone can accsess and update it *data can leak
    }

        public static void readTextFiles2()  {

            FileInputStream fis = null;
            try {

                fis = new FileInputStream("src/main/java/TextFileX.txt");

            } catch (FileNotFoundException e) {
                //throw new RuntimeException(e);
                //e.printStackTrace(): --> bu detayli report verir issue hakkinda

            }

            int i = 0;
            while (true){
                try {
                    if (!((i = fis.read()) != -1)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.print((char)i);
            }
           // fis.close();
    }
}
