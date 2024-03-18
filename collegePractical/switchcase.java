import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        System.out.println("enter the data:");
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        switch (x) 
        {
            default:
                System.out.println("default");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");   
        }
    }
}
