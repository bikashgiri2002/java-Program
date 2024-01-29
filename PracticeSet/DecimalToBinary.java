package PracticeSet;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int n=sc.nextInt();
        int n1 = n;
        int pow=0;
        int bin=0;
        while(n != 0)
        {
            int rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            n=n/2;
            pow++;
        }
        System.out.printf("Binary of %d is %d",n1,bin);
    }
}
