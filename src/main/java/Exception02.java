public class Exception02 {
    //***INTERVIEW: When your code doesn't work as expected, what do you do?
    //             -I read the logs.(messages in the console)

    public static void main(String[] args) {
        String arr[] = {"Ali", "Can","Veli","Han"};

        getAnElementFromAnArray(arr, 2);
        getAnElementFromAnArray(arr,0);
        getAnElementFromAnArray(arr,4); //Throw Exception: ArrayIndexOutOfBoundsException => Index 4 out of bounds for length 4
        //If you use invalid index
    }

    public static void getAnElementFromAnArray(String arr[], int idx){

        try{
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){  //every class can be data type
            System.err.println("An error occured in array operation==>" + e.getMessage()); //out yerine err kullandik kirmizi yazmasi icin
        }
    }
}
