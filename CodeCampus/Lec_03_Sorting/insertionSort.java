package CodeCampus.Lec_03_Sorting;

public class insertionSort {
    public static void iSort(int numbers[]){
        for(int i = 1; i<numbers.length; i++){
            int curr = numbers[i];
            int prev= i- 1;
            while(prev >= 0 && numbers[prev] > curr){
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            numbers[prev + 1] = curr;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5, 4, 3, 2, 1};
        iSort(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}

// Output: 1 2 3 4 5
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Note: Insertion Sort is not the most efficient sorting algorithm, but it is simple to understand and implement.
// It is mainly used for educational purposes to demonstrate the concept of sorting algorithms.
