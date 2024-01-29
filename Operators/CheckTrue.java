package Operators;
import java.util.Scanner;

public class CheckTrue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=sc.nextInt();
        if(a>50)
        {
            System.out.println(a+" is grater than 50");
        }
        else
        {
            System.out.println(a+" is not grater than 50");
        }
    }
}
