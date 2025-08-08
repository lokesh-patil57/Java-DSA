package OOPs;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
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
class Rook implements chessMaster{
    public void moves() {
        System.out.println("left , right ,up , down , Diagonal(in 1 line)");
    }
}