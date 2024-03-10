
public class Main {
    public static void main(String[] args) {

        //String handling
        //string is sequence of characters

        //Index            0    1    2    3    4    5    6    ----->length = 7
        char[] myArray = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};

        //using literals to create string
        String firstString = "Welcome"; //s1
        String secondString ="Welcome"; //s1

        //using new keyword
        String thirdString = new String("Welcome"); //s2

        //                 s1 == s1 -----> true
        System.out.println(firstString == secondString); //compare the objects

        //                   s1 == s2 ------>false
        System.out.println(firstString == thirdString);//compare the objects

        //                  "welcome.equals("welcome")
        System.out.println(firstString.equals(thirdString)); //compare the values of objects

        System.out.println(myArray.length);
        System.out.println(firstString.length());

        System.out.println(firstString.charAt(6));

        System.out.println(firstString.toUpperCase());
        System.out.println(firstString.toLowerCase());

        System.out.println(firstString.contains("come"));

        System.out.println(firstString + " to internshala");
        System.out.println(firstString.concat(" to internshal"));

        System.out.println(firstString.equalsIgnoreCase("WeLCOme"));

        String str = "";
        System.out.println(str.isEmpty());

        System.out.println(firstString.indexOf('c'));

        String str1 = "   hello world   ";
        System.out.println(str1.trim());

    }
}