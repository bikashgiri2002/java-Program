package College;
import java.io.DataInputStream;

public class DataInput {
    public static void main(String[] args)throws Exception{
        DataInputStream d=new DataInputStream(System.in);
        int a=Integer.parseInt(d.readLine());
        System.out.println(a);
    }
}
