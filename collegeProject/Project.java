package collegeProject;
import java.util.Scanner;

import static java.lang.System.exit;

public class Project {
    public static void incomeTax(){
        Scanner sc = new Scanner(System.in);
        Employee e=new Employee();
        char c= 'y';
        while (c == 'y' || c == 'Y') {
            e.input();
            e.cal();
            e.display();
            System.out.print("Enter 'y' to calculate more......");
            c=sc.next().charAt(0);
        }

    }
    public static void library(){
        Scanner sc =new Scanner(System.in);
        Library l=new Library();
        char c= 'y';
        while (c == 'y' || c == 'Y') {
            l.input();
            l.compute();
            l.display();
            System.out.print("Enter 'y' to calculate more......");
            c=sc.next().charAt(0);
        }
    }
    public static void discount(){
        Scanner sc=new Scanner(System.in);
        Discount d= new Discount();
        char c= 'y';
        while (c == 'y' || c == 'Y') {
            d.input();
            d.cal();
            d.display();
            System.out.print("Enter 'y' to calculate more......");
            c=sc.next().charAt(0);
        }
    }
    public static void telephoneBill(){
        Scanner sc= new Scanner(System.in);
        Telephone t=new Telephone();
        char c= 'y';
        while (c == 'y' || c == 'Y') {
            t.input();
            t.cal();
            t.display();
            System.out.print("Enter 'y' to calculate more......");
            c=sc.next().charAt(0);
        }
    }

    public static void interestCal() {
        Scanner sc= new Scanner(System.in);
        Interest i=new Interest();
        char c= 'y';
        while (c == 'y' || c == 'Y') {
            i.input();
            i.cal();
            i.display();
            System.out.print("Enter 'y' to calculate more......");
            c=sc.next().charAt(0);
        }

    }
    public static void railwayTicket(){
        Scanner sc= new Scanner(System.in);
        Railway r=new Railway();
        char c= 'y';
        while (c == 'y' || c == 'Y') {
            r.accept();
            r.cal();
            r.display();
            System.out.print("Enter 'y' to calculate more......");
            c=sc.next().charAt(0);
        }
    }

    public static void main(String[] args) {
        while (true) {
            int choose;
            Scanner sc = new Scanner(System.in);
            System.out.println("Projects Available");
            System.out.println("1.Tax Calculation");
            System.out.println("2.Library");
            System.out.println("3.Discount");
            System.out.println("4.Telephone Bill");
            System.out.println("5.Interest Calculation");
            System.out.println("6.RailWay Ticket");
            System.out.println("7.Exit");
            System.out.print("Enter your choose......");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    incomeTax();
                    break;
                case 2:
                    library();
                    break;
                case 3:
                    discount();
                    break;
                case 4:
                    telephoneBill();
                    break;
                case 5:
                    interestCal();
                    break;
                case 6:
                    railwayTicket();
                    break;
                case 7:
                    exit(0);
                    break;
                default :
                    System.out.println("Wrong choose");

            }
        }
    }
}
