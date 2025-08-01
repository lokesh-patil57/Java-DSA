package OOPs;

public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        
    }
}

class Pen {
    private String color;
    private int tip;
    
    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String newColor) {
        color = newColor;
    }

    // Getter for tip
    public int getTip() {
        return tip;
    }

    // Setter for tip
    public void setTip(int newSize) {
        tip = newSize;
    }
}
