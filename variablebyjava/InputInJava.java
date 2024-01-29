package variablebyjava;
import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc=new Scanner(System.in);//read from keyboard
        /*System.out.print("Enter the 1st number:");
       // int a=sc.nextInt();
        float a=sc.nextFloat();
        System.out.print("Enter the 2nd number:");
        //int b=sc.nextInt();
        float b=sc.nextFloat();
       // int sum=a+b;
        float sum=a+b;
        System.out.println("The sum of two number is "+sum);*/
        System.out.print("Enter a intiger:");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
    }
}
