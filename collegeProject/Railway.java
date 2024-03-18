package collegeProject;

import java.util.Scanner;

public class Railway {
    String name,coach;
    long mob_no;
    int amt,total;
    void accept(){
        System.out.println("Coaches Available\n" +
                "first_ac"+", second_ac" +
                ", third_ac" +
                ", sleeper");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        name=sc.nextLine();
        System.out.print("Enter your coach preference: ");
        coach=sc.next();
        System.out.print("Enter your Mobile_no: ");
        mob_no=sc.nextLong();
        System.out.print("Enter the amount: ");
        amt=sc.nextInt();
    }
    void cal(){
        switch (coach){
            case "first_ac":
                total=amt+700;
                break;
            case "second_ac":
                total=amt+500;
                break;
            case "third_ac":
                total=amt+250;
                break;
            case "sleeper":
                total=amt;
                break;
            default :
                System.out.println("Wrong preference");
            break;
        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Mob_No: "+mob_no);
        System.out.println("Coach :"+coach);
        System.out.println("Total: "+total);
    }
}
