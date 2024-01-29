package StringClass;
import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        int two=str.indexOf("  ");
        int three=str.indexOf("   ");
        if(two == -1)
        {
            System.out.println("String isn't contain any double space");
        }
        else
        {
            System.out.println("String contain double space at"+two);
        }
        if(three == -1)
        {
            System.out.println("String isn't contain any double spaces");
        }
        else
        {
            System.out.printf("String contain triple spaces at %d",three);
        }

    }
}
