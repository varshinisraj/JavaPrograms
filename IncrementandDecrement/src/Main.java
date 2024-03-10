// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Increment and Decrement operator

        //postfix:first use the value and then increment/Decrement
        //prefix:first increment/decrement and then use the value

        int age = 10;
        System.out.println(age++);
        System.out.println(age);

        System.out.println(++age);
        System.out.println(age);

        System.out.println(age++ + ++age);

        System.out.println(age-- + --age);
    }
}