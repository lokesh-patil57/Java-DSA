package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
        
    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }
    void breath() {
        System.out.println("breaths");
    }
}

class fish extends Animal {
    void swim () {
        System.out.println("Fish Swims");
    }
}