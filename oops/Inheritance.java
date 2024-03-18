package oops;
public class Inheritance {
    public static void main(String[] args) {
        Fish jinu = new Fish();
        jinu.eat();
        jinu.color="blue";
        System.out.println(jinu.color);
    }

}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
}
class Fish extends Animal{
    int fines;
    void swim(){
        System.out.println("swim");
    }
}
