import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String name;
        String groups = null;
        char bloodGroup;
        int age;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the student name");
        name = scanner.nextLine();

        System.out.println("enter the student age");
        age = scanner.nextInt();

        System.out.println("enter the student blood group");
        bloodGroup = scanner.next().charAt(0);

        System.out.println("__________________________________");

        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Blood group:" +bloodGroup);

        System.out.println("___________________________________");

        if(age >= 20){
            groups = "RED";
        } else if (age >= 15 ) {
            groups = "BLUE";
        } else if (age >=10) {
            groups = "YELLOW";
        }else{
            System.out.println("invalid");
        }

        System.out.println("your group is:" +groups);

        System.out.println("___________________________________");


        scanner.close();
    }
}