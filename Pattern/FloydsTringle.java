package Pattern;

public class FloydsTringle {
    public static void triangle(int n){
        int p=1;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.printf("%3d",p);
                p++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(30);
    }
}
