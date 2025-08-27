package OOPs;

public class abstraction {
    public static void main(String[] args) {
        mustang mg = new mustang();
        
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
    Horse() {
        System.out.println("Horse color");
    }
    void chageColor(){
        System.out.println("Horse color");
    }
    void walk(){
        System.out.println("Walks");
    }

}

class mustang extends Horse{
    mustang() {
        System.out.println("Mustang color");
    }
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
