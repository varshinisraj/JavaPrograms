// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        add(); //method 1

        add(10, 45);  //method 2

        add(5.6f, 3.2f, 9.6f); //method 3

    }

    public static void add(){  //method1
        int sum = 5 + 7;
        System.out.println(sum);
    }

    public static void add(int a , int b){ //method2
        int sum = a + b;
        System.out.println(sum);
    }

    public static void add(float a, float b, float c){ //method3
        float sum = a + b + c;
        System.out.println(sum);
    }
}