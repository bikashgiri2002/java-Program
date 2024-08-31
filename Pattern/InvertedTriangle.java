package Pattern;

public class InvertedTriangle {
    public static void printInverted(){
        for(int i = 1; i <= 5; i++){
            for(int j = i; j<= 5; j++){
                if(j > i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printInverted();
    }
}
