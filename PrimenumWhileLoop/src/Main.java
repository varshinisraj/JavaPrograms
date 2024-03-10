import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Using while loop

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number:");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("not prime");
            System.exit(0);
        }

            int flag = 0;
            int i = 2;

            while (i < num){
                i++;
                if (num % i == 0){
                    System.out.println(num + " is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println(num + " is prime");
            scanner.close();
        }
    }
