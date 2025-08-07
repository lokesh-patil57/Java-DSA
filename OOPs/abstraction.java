package OOPs;

public class abstraction {
    public static void main(String[] args) {
        
    }
}

abstract class Animal{
    String color;
    Animal(){
        color="Brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void chageColor(){
        System.out.println("Dark Brown");
    }
    void walk(){
        System.out.println("Walks");
    }

}
