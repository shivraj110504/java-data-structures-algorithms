package CodeCampus.Lec_04_2DArrays;

public class diagonalSum2 {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i<matrix.length; i++){
            //for primary diagonal
            sum += matrix[i][i];
            //for secondary diagonal
            if(i != matrix.length - 1 -i){
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(diagonalSum(matrix));
    }
}
// Output: 25
// Time Complexity: O(n) where n is the number of rows or columns in the square matrix.
