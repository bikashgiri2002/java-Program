package StringClass;
import java.util.Scanner;

public class PracticeSet3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name=sc.next();
        String letter="Dear <|name|>,Thanks alot";
        letter=letter.replace("<|name|>", name);
        System.out.println(letter);
    }
}
