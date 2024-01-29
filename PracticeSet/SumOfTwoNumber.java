package PracticeSet;
import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the 1st number:");
        a=sc.nextInt();
        System.out.print("Enter the 2nd number:");
        b=sc.nextInt();
        System.out.print("Enter the 3rd number:");
        c=sc.nextInt();
        int sum=a+b+c;
        System.out.println(sum+" is the sum of "+a+", "+b+",and "+c);
    }
}
