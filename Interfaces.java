// creates a interfaces to implement for example a chessboard elements movements 

public class Interfaces {
    public static void main(String[] args) {
        King keys = new King();
        keys.moves();
    }
}

interface chessboard {
    void moves();
}

class Queen implements chessboard{
    public void moves(){
        System.out.println("Up, Down, left, Right (Move all directions)");
    }
}

class Rook implements chessboard{
    public void moves(){
        System.out.println("Up, Down, left, Right");
    }
}

class King implements chessboard{
    public void moves(){
        System.out.println("Up, Down, left, Right (only one steps)");
    }
}