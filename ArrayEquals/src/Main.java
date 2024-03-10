import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[] {1, 4, 6, 9}; // s1
        int[] array2 = new int[] {1, 4, 6, 9}; //s2

        // compare the objects s1 == s2 ----> s1 is not equal to s2
        if(array1 == array2)
            System.out.println("Array is equal");
        else
            System.out.println("Array is not equal");

        //using equals -----> compare the values 
        if(Arrays.equals(array1,array2))
            System.out.println("Array is equal");
        else
            System.out.println("array is not equal");

        // compare the values 1 4 6 9 = 1 4 6 9 ------>true
        System.out.println(Arrays.equals(array1,array2));
    }
}