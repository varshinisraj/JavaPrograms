// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Exception Handling

        System.out.println("program starts");

        int[] myArray = { 3, 45, 8, 10};

        try{

            int result = myArray[1] / 0;  //ArithmeticException
            System.out.println(myArray[3]); //ArrayIndexOutOfBoundsException occured
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("the finally block is always executed");
        }

        try {
            String str = null;        //no object is created
            String s = str.concat("Hello");
            System.out.println(s.length());
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println("program ends");
    }
}