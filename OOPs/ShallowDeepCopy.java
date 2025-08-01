package OOPs;

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks[0] = 97;
        s1.marks[1] = 95;
        s1.marks[2] = 91;
        Student s2 = new Student(s1);
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];
    Student(){
        marks=new int[3];
        System.out.println("hello");
        
    }

    //copy constructor
    // Student(Student S1){
    //     marks=new int[3];
    //     this.name=S1.name;
    //     this.roll=S1.roll;
    //     this.marks=S1.marks;
    // }

    //deep copy constructor
    Student(Student S1){
        marks=new int[3];
        // this.name=name;
        // this.roll=roll;
        //S1.marks[2]=27;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=S1.marks[i];
        }
    }
}