package oops;

import com.sun.source.tree.ImportTree;

public class Interfaces {
}
interface ChessPlayer{
    void moves();
}
interface Move{
    void go();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("ups,down,lefts,right,diagonal");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("ups,downs,left,right");
    }
}
class HorseRide implements ChessPlayer,Move{
    public void moves(){

    }
    public void go(){

    }
}
