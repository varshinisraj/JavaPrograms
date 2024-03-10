import java.util.Scanner;

public class Main {
    public static String findMaxXOR(String x) {
        int n = x.length();
        StringBuilder y = new StringBuilder();

        for (int i = 0; i < n; i++) {
            y.append('1'); // Initialize y with all '1's
        }

        return y.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string x: ");
        String x = scanner.nextLine();

        String maxY = findMaxXOR(x);
        System.out.println("The binary string y for maximum XOR is: " + maxY);
    }
}
