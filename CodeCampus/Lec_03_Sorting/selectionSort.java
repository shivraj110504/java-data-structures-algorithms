package CodeCampus.Lec_03_Sorting;

public class selectionSort {
    public static void sSort(int numbers[]){
        for(int i = 0; i<numbers.length -1; i++){
            int minPos = i;
            for(int j = i+1; j<numbers.length; j++){
                if(numbers[minPos] > numbers[j]){
                    minPos = j;
                }
            }
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5, 4, 3, 2, 1};
        sSort(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}

// Output: 1 2 3 4 5
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Note: Selection Sort is not the most efficient sorting algorithm, but it is simple to understand and implement.
// It is mainly used for educational purposes to demonstrate the concept of sorting algorithms.
