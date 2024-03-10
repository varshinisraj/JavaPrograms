import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your friend name");
        name = scanner.nextLine();

        System.out.println("hey" +name+ ",its my birthday this weekend and you are invited to the party at my place, bring gifts!!! ");
    }
}