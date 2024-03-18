package oops;
import java.util.*;

public class Constructors {
    public static void main(String[] args) {
        Bank c =new Bank();// as class Bank has default access specifier it can access inside the package
        c.user_id="jinu";
        System.out.println(c.user_id);
        BankAccount b=new BankAccount();
        b.user_id="biku";
        System.out.println(b.user_id);
        BankAccount d= new BankAccount("bhagya");
        System.out.println(d.user_id);
        BankAccount e=new BankAccount(b);
        e.marks[0]=100;
        e.marks[1]=90;
        e.marks[2]=20;
        e.percentage[0]=45;
        e.percentage[1]=145;
        e.percentage[2]=245;
        System.out.println(e.marks[1]);
    }
}
//we can"t create private classes
class BankAccount{
    String user_id;
    private String password;
    int marks[]=new int[3];
    int percentage[]=new int[3];
    void setPassword(String password){
        this.password =password;
    }
    String getPassword(){
        return this.password;
    }
    //default constructor provided by java
    //Non-Parameterized Constructor
    BankAccount(){

    }
    //parameterized Constructor
    BankAccount(String name){
        this.user_id=name;
    }
    //copy Constructor

    BankAccount(BankAccount ba){
        this.user_id=ba.user_id;
        this.password=ba.password;
        //sallow copy
        this.marks=ba.marks;
        //deep copy
        for (int i=0;i< percentage.length ;i++){
            this.percentage[i]=ba.percentage[i];
        }

    }

}