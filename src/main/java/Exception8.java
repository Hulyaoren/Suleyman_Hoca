public class Exception8 {

    public static void main(String[] args) throws IllegalGradeException {
        checkGrade(200);

    }

    //If you create an Exception it is called "Custom Exception". (checked or unchecked)
    /*
        To create a "checked exception"
        1) Create Exception class
        2)Do not forget to extend "Exception"
        3)Create constructor with "String message" parameter and
        put "super(message)" inside the constructor
     */
    //Create "IllegalGradeException" . grade>0 or grade<101


    public static void  checkGrade (int grade) throws IllegalGradeException {
        if(grade < 0 || grade > 100) {
            throw new IllegalGradeException( grade + "is not between 0 and 100 but it must be..");
        }
        System.out.println("Your grade is " +  grade);
    }
    static class IllegalGradeException extends Exception {
        public IllegalGradeException(String message) {   //makes message dynamic???
            super(message); //the structure of the exception message comes from parent "Exception"

        }
    }
}
