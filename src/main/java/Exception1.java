public class Exception1 {
    /*
    1) Exception means un-expected issues in your class
    2) There are 2 ways to work with
        i) Exception Handling: try-catch blocks
        ii) Throw Exception

     */
    public static void main(String[] args) {
        divide(12, 3);
        divide(0,3);
        divide(12,0);
    }

    /*
        1)If you think any problem can occur for any line, put it inside try block then create a catch block
        2)Inside the catch-block paranthesis put the possible exception class
        3)By using "e.getMessage()", you can get technical message
        4)If you want you can put non-technical message
        5)if the codes inside try-body works without any issiue, catch block will not be executed
        ****6)after any excepton occured next lines of codes can not be executed.JAVA STOPS EXECUTION

     */
    public static void divide(int a, int b) {
        try{
            System.out.println(a/b);
            System.out.println("Hi");
            System.out.println("Bye");
        } catch (ArithmeticException e){
            System.out.println("Couldn't divide" + e.getMessage());
        }
    }
}
