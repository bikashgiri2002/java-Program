package task;
import java.util.Scanner;

public class TaskMarkToPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the full mark for each subject:");
        int full=sc.nextInt();
        float s1,s2,s3,s4,s5;
        System.out.print("Enter the mark of subject 1:");
        s1=sc.nextFloat();
        System.out.print("Enter the mark of subject 2:");
        s2=sc.nextFloat();
        System.out.print("Enter the mark of subject 3:");
        s3=sc.nextFloat();
        System.out.print("Enter the mark of subject 4:");
        s4=sc.nextFloat();
        System.out.print("Enter the mark of subject 5:");
        s5=sc.nextFloat();
        float fullmark=5*full;
        float per=((s1+s2+s3+s4+s5)/fullmark)*100;
        System.out.println("The percentage of this student is:"+per);
    }
}
