import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        System.out.println("Name :" +name);
        System.out.println("Age :" +age);

        scanner.close();
    }
}