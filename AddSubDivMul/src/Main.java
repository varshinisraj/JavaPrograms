import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a , b, c;
        char operator;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter the A value: ");
        a = scanner.nextInt();

        System.out.println("enter the B value: ");
        b = scanner.nextInt();

        System.out.println("enter the operator: ");
        operator =scanner.next().charAt(0);

        switch (operator){
            case '+':
                c = a + b;
                System.out.println("add: " +c);
                break;

            case '-':
                c = a - b;
                System.out.println("sub: " +c);
                break;

            case '*':
                c = a * b;
                System.out.println("multiplication: "+c);
                break;

            case '/':
                c = a / b;
                System.out.println("divide: "+c);
        }

    }
}