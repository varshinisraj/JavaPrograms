// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //WHILE LOOP
        //to print natural numbers till 10 0,1,2--------10

        int count = 0;
        while (count <= 10){
            System.out.println(count);
            count++;
        }

        /*to find factorial of a number
        ex: factorial of 5 = 5 * 4 * 3 * 2 * 1 = 120  */

        int num = 9;
        long factorial = 1;
        while (num > 0){
            factorial *= num; //factorial = factorial * num;
            num--;
        }
        System.out.println("factorial is:" +factorial);
    }
}