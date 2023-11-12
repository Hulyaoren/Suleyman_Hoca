public class Exceptions5 {
    /*
        When you use multiple catch block, just one of them can be executed at the same time
     */

    public static void main(String[] args) {
        String s = "Hello!";
//        getCharacterFromAString(s,2);
//
//        getCharacterFromAString(s,6); //

       // divideTheLengths(s,1,5,3); //2
       // divideTheLengths(s,1,7,3); //Throw exception: StringIndexOutOfBound
        divideTheLengths(s,1,1,1  );//ArtihmeticException
    }


    public static void divideTheLengths(String str, int idx1, int idx2, int idx3){


        try{
            int firstLength = str.substring(idx1, idx2).length();
            System.out.println("Hello2");
            int secondLength = str.substring(idx1,idx3).length();
            System.out.println(firstLength/secondLength);

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("an issue occured in character selection ==>" + e.getMessage());
            System.out.println("Hello1");

        }catch(ArithmeticException e){
            System.err.println("an issue occured in division" + e.getMessage());
            System.out.println("Bye");
        }
    }

}
