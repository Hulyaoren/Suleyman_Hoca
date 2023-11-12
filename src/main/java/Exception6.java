public class Exception6 {
    //Selim hocanin ornegi;
    public static void main(String[] args) {
        System.out.println(divide(6, 2));
        System.out.println(divide(1, 2));
        System.out.println(divide(0, 2));
        System.out.println(divide(4, 0));
        System.out.println("hi");

        System.out.println(divideTwoNumbers(8, 8));
        System.out.println(divideTwoNumbers(8, 0));


    }
//first way
    public static  int divide(int a,int b){
        if(b==0){
            return 0;
        }
        return a/b;
    }

//second way
    public static int divideTwoNumbers(int a, int b){
        int result = 0;  //return type int, that's why we must return sth
        try{
            result = a/b;

        }catch (ArithmeticException e){
            System.out.println("You can not divide by zero");
        }
        return result;
    }

}
