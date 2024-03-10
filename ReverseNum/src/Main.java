// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int reverseDigits(int num){
        int rev_num = 0;
        while (num > 0){
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;

        }
        return rev_num;
    }

    public static void main(String[] args){
        int num = 567;
        System.out.println("Reverse of num is: " +reverseDigits(num) );
    }
}