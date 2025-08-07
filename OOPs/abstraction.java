package OOPs;

public class abstraction {
    public static void main(String[] args) {
        
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal color");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void chageColor(){
        System.out.println("Horse color");
    }
    void walk(){
        System.out.println("Walks");
    }

}

class mustang {
    void chageColor(){
        System.out.println("Mustang color");
    }

}



class Chicken extends Animal{
    void chageColor(){
        System.out.println("White");
    }
    void walk(){
        System.out.println("Chicken flies");
    }
}
