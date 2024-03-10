// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "pug";
        dog.color = "black";
        dog.bark();
        dog.run();

        Cat cat = new Cat();
        cat.name = " persian";
        cat.pattern = "tabby";
        cat.meow();
        cat.run();

        Animal animal = new Animal();
        animal.name = " my animal";
        animal.run();
    }
}

        class Animal{
            String name;
            public void run() {
                System.out.println("Animal is running");
            }
        }

        class Dog extends Animal{
            String color;
            public void bark(){
                System.out.println("wooh ! wooh!");
            }
        }

        class Cat extends Animal{
            String pattern;
            public void meow(){
                System.out.println("weom weom");
            }
        }
