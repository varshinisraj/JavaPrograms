// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //wap for simple interest  si = principle * rateofinterest * timeperiod /100;

        //user1
        double si1 = calculateSimpleInterest(10000, 8.7f, 2);
        System.out.println(si1);

        //user2
        double si2 = calculateSimpleInterest(4000, 12.7f, 8);
        System.out.println(si2);

        //user3
        double si3 = calculateSimpleInterest(130000, 10.5f, 4);
        System.out.println(si3);

    }

    public static double calculateSimpleInterest ( int principle, float rateOfInterest, int timePeriod){
        double si = principle * rateOfInterest * timePeriod / 100;
        return si;
    }
}