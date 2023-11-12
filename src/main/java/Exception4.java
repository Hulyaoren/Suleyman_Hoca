public class Exception4 {

    public static void main(String[] args) {

        String str = "123";
        convertStringToInteger(str); //124 proves that it returns integer

        String s ="123a";
        convertStringToInteger(s); //Throws Exception: NumberFormatException

    }

    //convert String to integer methods : Integer.valueOf(String);==> returns Integer
    //                                    Integer.parseInt(); ==> returns Int

    public static void convertStringToInteger(String str){

        try{
            System.out.println(Integer.parseInt(str) +1 );
        }catch (NumberFormatException e){
            System.err.println("String couldn't be converted to an int ==>" + e.getMessage());

        }

    }
}
