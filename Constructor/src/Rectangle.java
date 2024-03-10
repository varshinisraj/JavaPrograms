public class Rectangle {

    public float length;
    public float breadth;

    public Rectangle(){  // Default constructor
        System.out.println("Default constructor triggered");
    }

    public Rectangle(float l, float b){     //Parameterized constructor
        length = l;
        breadth = b;
    }
}
