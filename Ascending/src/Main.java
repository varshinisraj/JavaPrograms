import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter num of elements in array: ");
        num = scanner.nextInt();
        int a[] = new int[num];
        System.out.println("enter all the elements: ");

        for (int i = 0; i < num; i++){
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++){
            for (int j = i + 1; j < num; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("ascending order:");
        for (int i =0; i < num-1; i++){
            System.out.print(a[i] +",");
        }
        System.out.println(a[num - 1]);
    }
}