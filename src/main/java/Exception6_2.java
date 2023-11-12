public class Exception6_2 {

    public static void main(String[] args) {
        Object obj1 = 12;
        convert(obj1); //ClassCastException: If some data types can not be converted to another data types, Java throws that exception

        String s1 = "139";
        convertStringToInteger(s1);

        String s2 = "1a23b";
        convertStringToInteger(s2); //NumberFormatException

        String s3 = "";
        convertStringToInteger(s3); //NumberFormatException
    }

    public static void convert(Object obj){
        try {
            String convertedString = (String) obj; //Explicit narrowing

            System.out.println(convertedString);
        }catch (ClassCastException e){
            System.out.println("Some data types can not be converted to other data types");
        }

    }

    public static void convertStringToInteger(String str){
        try {
            int pareseString = Integer.parseInt(str);
            System.out.println("This is integer:" + pareseString);
        }catch (NumberFormatException e){
            System.out.println(str + " couldn't be parsed to integer, because it has characters different from digits");
        }
    }
}
