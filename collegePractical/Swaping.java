import java.io.*;
public class Swaping {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two number");
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+", b="+b);
    }
}