package OOPs;

public class Constructors {
    public static void main(String[] args) {
        Student st = new Student();
        Student st1 = new Student("Name in st1 : Lucky");
        System.out.println("st name : "+st.name);
        System.out.println(st1.name);
        Student st2 = new Student(st1);
        System.out.println("Copy constructor name from st1 : "+st2.name);
    }
}
class Student{
    String name;
    int roll;
    // Non-Parameterized Construtor
    Student() {
        System.out.println("non parameterized constuctor");
    }
    // Parameterized Constructor
    Student(String newName){
        this.name = newName;
    }
    // Copy Constructor
    Student(Student st1) {
        this.name = st1.name;
        this.roll = st1.roll;
    }
}
