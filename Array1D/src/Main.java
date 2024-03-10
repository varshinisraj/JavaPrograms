// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //index =           0   1   2  3
        int [] myArray = { 20, 19, 48, 7};

        //to modify our array
        myArray[2] = 73;

        System.out.println(myArray[2]);

        //to find length of the array
        System.out.println("Array length is:" +myArray.length);

        // to print all the elements in array
        for (int i = 0; i < myArray.length; i++){
            System.out.println(+myArray[i]);
        }
    }
}