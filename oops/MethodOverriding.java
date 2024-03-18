package oops;

public class MethodOverriding {
    public static void main(String[] args) {
        AnimalKingdom a= new AnimalKingdom();
        a.eat();
        Deer d = new Deer();
        d.eat();
        Packages p=new Packages();
    }
}
class AnimalKingdom{
    void eat(){
        System.out.println("Eat foods");
    }
}
class Deer extends AnimalKingdom{
    void eat(){
        System.out.println("Eats grass");
    }
}
