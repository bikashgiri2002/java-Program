package Operators;
import java.util.Scanner;
public class Math {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the final velocity");
        int v=sc.nextInt();
        System.out.print("Enter the initial velocity");
        int u=sc.nextInt();
        System.out.print("Enter the acceleration");
        int a=sc.nextInt();
        System.out.print("Enter the displacement");
        int s=sc.nextInt();
        float r=(float)((v*v)-(u*u))/(2*a*s);
        System.out.println(r);
    }
}
