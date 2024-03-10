public class Rectangle {

    private float length;
    private float breadth;

    public float getArea() {
        float area = length * breadth;
        return area;
    }

    public float getperimeter(){
        float perimeter = 2 * (length + breadth);
        return perimeter;
    }
      //GETTER AND SETTER
    public float getLength() {
        return length;
    }

    public void setLength(float length){
        this.length = length;
    }
    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
}
