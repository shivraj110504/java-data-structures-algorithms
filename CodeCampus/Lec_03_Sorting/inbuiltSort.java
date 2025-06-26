package CodeCampus.Lec_03_Sorting;

public class inbuiltSort {
    public static void main(String[] args) {
        int numbers[] = {5, 4, 3, 2, 1};
        
        // Using Java's built-in sort method
        java.util.Arrays.sort(numbers);
        
        // Printing the sorted array
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

}
// Output: 1 2 3 4 5
// Time Complexity: O(n log n)
// Space Complexity: O(1) for primitive types, O(n) for objects
// Note: Java's built-in sort method uses a dual-pivot quicksort algorithm for primitive types, which is efficient and widely used.
// It is the recommended way to sort arrays in Java due to its efficiency and simplicity.

