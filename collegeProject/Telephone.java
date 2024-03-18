package collegeProject;

import java.util.Scanner;

public class Telephone {

    Scanner sc =new Scanner(System.in) ;
    int pre,prv,call;
    String name;
    double amt,total;
    void input(){
        System.out.print("Enter name of the customer: ");
        name=sc.next();
        System.out.print("Enter the previous month reading: ");
        prv=sc.nextInt();
        System.out.print("Enter the present reading: ");
        pre=sc.nextInt();
    }
    void cal(){
        call=pre-prv;
        if (call <=100){
            amt=0;
        }
        else if(call >100 && call<=200){
            amt=(call-100)*0.9;
        }
        else if(call >200 && call<=400){
            amt=90+(call-200)*0.8;
        }
        else{
            amt=250+(call-400)*0.7;
        }
        if (amt <= 180){
            amt=180;
        }
    }
    void display(){
        System.out.println("Customer Name: "+name);
        System.out.println("Number of call this month: "+call);
        System.out.println("Bill for this Month: "+amt);
    }
}
