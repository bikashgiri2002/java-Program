package collegePractical.sorting;

import java.util.Scanner;

import static java.lang.System.exit;

public class Sorting {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("Sorting Methods");
            System.out.println("1.Selection");
            System.out.println("2.Bubble");
            System.out.println("3.Insertion");
            System.out.print("Enter your choose: ");
            int c=sc.nextInt();
            switch(c){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Wrong Choose");
            }
        }
    }
}
