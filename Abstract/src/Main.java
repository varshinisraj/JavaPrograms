// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       Animal animal1 = new Dog();
       animal1.run();
       animal1.eat();
    }
}

abstract class Animal {
    public void run(){
        System.out.println("animal is running!");
    }
    abstract public void eat();
}

class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("dog is eating!");
    }
}