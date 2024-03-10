import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // using for loop

        Scanner scanner = new Scanner(System.in);

        int flag = 0;

        System.out.println("enter a number:");
        int num = scanner.nextInt();
        if(num == 0){
            System.out.println("Not Prime");
            System.exit(0);
        }
        for(int i =2; i < num; i++){
            if(num % i == 0){
                System.out.println(num + " is not prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println(num+ " is prime");

        scanner.close();
    }
}