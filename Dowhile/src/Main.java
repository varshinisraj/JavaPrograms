import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // DO WHILE LOOP
        //to print natural numbers till 10

        int count = 0;
        do {
            System.out.println(count);
            count++;
        }
        while (count <= 10);

        //WAP to add numbers until users enters 0

        Scanner scanner = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        do {
            System.out.println("enter a number:");
            number = scanner.nextDouble();
            sum += number; //sum = sum + numbers;
        }
        while (number != 0);
        System.out.println("the sum is:" +sum);
    }
}