//brute force approach
// Time Complexity: O(n^2)
package CodeCampus.Lec_04_2DArrays;

public class diagonalSum1 {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length - 1){
                    sum += matrix[i][j];
                }
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

//output: 25
// Time Complexity: O(n^2) where n is the number of rows or columns in the square matrix.
