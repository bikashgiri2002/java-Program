package collegeProject;
import java.util.Scanner;
public class Library {
    Scanner sc =new Scanner(System.in);
    int acc_num;
    String title;
    String author;
    int fine;
    void input(){
        System.out.print("Enter the acc_num: ");
        acc_num =sc.nextInt();
        System.out.print("Enter the title: ");
        sc.nextLine();
        title=sc.nextLine();
        System.out.print("Enter the author: ");
        author=sc.nextLine();
    }
    void compute(){
        System.out.print("Enter the late of dates: ");
        fine=2*sc.nextInt();
    }
    void display(){
        System.out.println("acc_num\tTitle\t\tAuthor\t\tfine");
        System.out.println("--------------------------------------------------");
        System.out.printf("%6d %8s %8s %5d\n",acc_num,title,author,fine);
    }

}
