package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(5, 4));
        System.out.println(cal.sum((float) 4.5, (float) 4.5));
        System.out.println(cal.sum(5, 4 , 7));


        // eat function in child called
        Deer d = new Deer();
        d.eat();
    }

}

// Mdethod Overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }

}

// Method Overriding

class Animals{
    void eat () {
        System.out.println("eats everything");
    }
}

class Deer extends Animals{
    void eat () {
        System.out.println("eats grass");
    }
}