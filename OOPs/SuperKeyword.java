package OOPs;

public class SuperKeyword {
    public static void main(String[] args) {
        
    }
}

class Animal{
    String color;
    Animal() {
        System.out.println("Animal Constructor is Called");
    }
}

class Horse extends Animal{
    Horse() {
        super.color = "Brown";
        System.out.println("Horse Constructor is Called");
    }
}
