import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String name;
        int population;
        float populationDensity;
        double GDP;
        char currency;
        boolean isSecular;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your country name:");
        name = scanner.nextLine();

        System.out.println("enter population:");
        population = scanner.nextInt();

        System.out.println("enter currency symbol:");
        currency = scanner.next().charAt(0);

        System.out.println("your country name is:" +name);
        System.out.println("the population of the country is:" +population);
        System.out.println("the currency symbol is:" +currency);

        scanner.close();


    }
}