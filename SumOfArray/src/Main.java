// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //sum of array elements
        int[] myArray = {20, 30, 10, 15};
        int sum = 0;
        for (int i =0; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println("sum of array is:" +sum);
    }
}