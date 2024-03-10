// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();

    }
}

class Animal{
    public void run(){
        System.out.println("Animal is running !");
    }
}

class Dog extends Animal{
    public void run(){
        System.out.println("dog is running !");
        super.run();
    }
}