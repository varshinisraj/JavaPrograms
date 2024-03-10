// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //relational operator

        int x = 2;
        int y = 3;
        int z = 3;

        //greater than and greater than equal to
        boolean r1 = x > y; //r1 = f
        boolean r2 = y >= x; // r2 = t

        //less than and less than equal to
        boolean r3 = x < y; //r3 = t
        boolean r4 = y <= x; // r4 = f

        //is equal to  and is not equal to
        boolean r5 = y == z; //r1 = f
        boolean r6 = z != x; // r2 = t

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
    }
}