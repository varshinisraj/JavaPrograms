import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //IF-ELSE IF

        int score;
        char grade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your score");
        score = scanner.nextInt();

        if(score >= 90){
            grade = 'A';
        }
        else if (score >= 80){
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println("Grade:" +grade);

        //Switch case statement

        switch (grade){

            case 'A':
                System.out.println("excellent");
                break;

            case 'B':
                System.out.println("very good");
                break;

            case 'C':
                System.out.println("good , keep it up");
                break;

            case 'D':
                System.out.println("Not bad");
                break;

            case 'F':
                System.out.println("you have failed");
                break;

            default:
                System.out.println("invalid grade");
        }
    }
}