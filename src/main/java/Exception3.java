public class Exception3 {

    public static void main(String[] args) {

        String str = "";
        getNumOfCharactersInAString(str); //0

        String s="Ali";
        getNumOfCharactersInAString(s); //3

        String t = null;
        getNumOfCharactersInAString(t); //Throws Exception:NullPointerException
        //When we use length method with null string we get "NullPointerException"
        //In the interview we can give examples to explain a question


    }

    public static void getNumOfCharactersInAString(String str){ //Method names should have a verb like get, calculate

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.err.println("Issue occured when I count the number of characters" );
            e.printStackTrace(); //if you want to see the problem with details, get technical message

        }
    }
}
