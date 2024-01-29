package ConditionalPracticeSet;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        if(a=11)
//        {
//            System.out.println("a is 11");
//        }
//        else
//        {
//            System.out.println("a is not 11");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark of each subjects(3)");
        float s1=sc.nextFloat();
        float s2 =sc.nextFloat();
        float s3=sc.nextFloat();
        if(s1>=33 && s2>=33 && s3 >=33)
        {
            if ((s1+s2+s3)/3 >= 40)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
