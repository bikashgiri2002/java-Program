package StringClass;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

          String name ="Hello World";
          String n="Hello world";
          int length=name.length();
        System.out.println(length);
        String low=name.toLowerCase();
        System.out.println(low);
        String upp=name.toUpperCase();
        System.out.println(upp);
//        System.out.println(name);
//        Scanner sc=new Scanner(System.in);
//        String st=sc.nextLine();
//        System.out.printf("%s",st);
//        int a=5;
//        System.out.printf("%03d",a);
        System.out.println(name.equalsIgnoreCase(n));
    }
}
