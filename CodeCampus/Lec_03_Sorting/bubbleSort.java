package CodeCampus.Lec_03_Sorting;

public class bubbleSort {
    public static void bSort(int numbers[]){
        for(int turn = 0; turn < numbers.length - 1; turn++){
            for(int j = 0; j < numbers.length - turn - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    // swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int numbers[] = {5, 4, 3, 2, 1};
        bSort(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}

// Output: 1 2 3 4 5
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Note: Bubble Sort is not the most efficient sorting algorithm, but it is simple to understand and implement.
// It is mainly used for educational purposes to demonstrate the concept of sorting algorithms.