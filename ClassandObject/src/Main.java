// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //dog1
        Dog dog1 = new Dog();
        dog1.breed = "german shepherd";
        dog1.size = 50;
        dog1.color = "black";

        dog1.bark();
        dog1.run();

        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);

        //dog2
        Dog dog2 = new Dog();
        dog2.breed = "labrador";
        dog2.size = 35;
        dog2.color = "brown";

        dog2.bark();
        dog2.run();
    }
}