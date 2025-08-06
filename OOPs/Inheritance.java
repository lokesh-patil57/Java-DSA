package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        // fish shark = new fish();
        // shark.eat();

        dog spidy = new dog();
        spidy.eat();
        spidy.legs = 4;
        System.out.println(spidy.legs);  

        
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

// Multi level Inheritance
class mamal extends Animal{
   int legs; 
}

class dog extends mamal{
    String breed;
}

// Single level Inheritance
// class fish extends Animal {
//     void swim () {
//         System.out.println("Fish Swims");
//     }
// }


// Hirarchi Inheritance

class fish extends Animal{
   int fins; 
}

class birds extends Animal {
    int wings;
}

// Hybrid Inheritance

class shark extends fish{
    
}

class peacock extends birds{
    
}