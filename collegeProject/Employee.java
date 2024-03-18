package collegeProject;
import java.util.Scanner;

public class Employee {
    int pan;
    String name;
    double income;
    double tax;
    void input(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name :");
        name=sc.nextLine();
        System.out.print("Enter your pan :");
        pan=sc.nextInt();
        System.out.print("Enter your income :");
        income=sc.nextDouble();
    }
    void cal(){
        if (income <= 250000){
            tax=0;
        }
        else if (income > 250000 && income <= 500000){
            tax=(income-250000)*0.1;
        }
        else if (income > 500000 && income <= 1000000){
            tax=30000+(income - 500000)*0.2;
        }
        else{
            tax = 50000+(income - 1000000)*0.3;
        }
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Pan : "+pan);
        System.out.println("Income : "+income);
        System.out.println("Tax amount : "+tax);
    }

}
