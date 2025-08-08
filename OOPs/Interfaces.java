package OOPs;

public class Interfaces {
    public static void main(String[] args) {
        
    }
}

interface chessMaster {
    void moves();
}

class Queen implements chessMaster{
    public void moves() {
        System.out.println("left , right ,up , down , Diagonal(in all line)");
    }
}
