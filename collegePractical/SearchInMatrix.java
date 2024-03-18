public class SearchInMatrix {
    public static boolean search(int key, int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == key) {
                    System.out.println(key+" present at ("+i+", "+j+")");
                    return true;
                }
            }
        }
        System.out.println(key+" is not present.");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10}};
        search(5, matrix);
    }
}
