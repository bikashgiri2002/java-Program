package collegeProject;
import java.util.Scanner;

public class Discount {
    int cost;
    String name;
    double dc;
    double amt;
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Name of customer: ");
        name=sc.nextLine();
        System.out.print("Enter the cost of product: ");
        cost=sc.nextInt();
    }
    void cal(){
        if (cost<=5000){
            dc=0;
        }
        else if(cost > 5000 && cost <= 10000){
            dc=cost*0.1;
        }
        else if (cost > 10000 && cost <= 15000){
            dc=cost*0.15;
        }
        else {
            dc=cost*0.2;
        }
        amt=cost-dc;
    }
    void display(){
        System.out.println("customer name\tDiscount\tAmount");
        System.out.println(name+"  "+dc+"  "+amt);
    }

}
