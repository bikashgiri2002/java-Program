package oops;

public class Abstraction  {
    public static void main(String[] args) {
        Horse h=new Horse();
        Chicken c=new Chicken();
        h.eat();;
        h.walk();
        c.eat();
        c.walk();
//      Animal->Horse->Mustang
        Mustang m=new Mustang();
    }
}
abstract class Animal1{
    String color;
    //constructor for a can be created....it use to give a default values to all his child classes
    Animal1(){
        color="brown";
        System.out.println("Animal constructor");
    }
    void eat() {
        System.out.println("it eats");
    }
    abstract void walk();
}
class Horse extends Animal1 {
    Horse(){
        System.out.println("horse constructor");
    }
    void walk(){
        System.out.println("it walks");
    }
}
class Chicken extends Animal1 {
    void walk(){
        System.out.println("it's walks in two legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor");
    }
}
