// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //2D Array

        int [][] myArray = {
                {3, 5, 1, 9},
                {10, 15, 3, 0},
                {1, 11, 31, 90},
                {2, 51, 1, 9}
        };

        int sum = 0;

        for (int row = 0; row < myArray.length; row++){

            for (int column = 0; column < myArray[row].length; column++){

                // sum of the array
                sum += myArray[row][column];

                System.out.print(myArray[row][column] +" ");
            }
            System.out.println();
        }
        System.out.println("sum of the array is: " +sum);
    }
}