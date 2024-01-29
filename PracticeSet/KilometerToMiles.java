package PracticeSet;
import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float km=0;
        float miles=0;
        float ans;
        System.out.print("Enter 1 for km and 2 for miles:");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Enter km:");
                km=sc.nextInt();
                ans=km*0.62137119f;
                System.out.println(km+"km is "+ans+"miles");
                break;
            case 2:
                System.out.println("Enter miles");
                miles= sc.nextInt();
                ans=miles* 1.609344f;
                System.out.println(miles+"miles is "+ans+"km");
                break;
            default:
                System.out.println("Invelid option");
        }
    }
}
