package OOPs;


public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "PVC";
        Student S2 =  new Student();
        System.out.println(S2.schoolname);
    }

    static class Student {
        int rollNo;
        String name;
        static String schoolname;

        // Student() {
        //     System.out.println("non parameterized constuctor");
        // }

        void setName(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }
    }
}
