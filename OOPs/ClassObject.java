package OOPs;

public class ClassObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.color = "Blue";
        System.out.println(p1.color);
        
    }
}

class Pen {
    String color;
    int tip;
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newSize) {
        tip = newSize;
    }
 }
