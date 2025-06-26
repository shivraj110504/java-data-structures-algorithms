package CodeCampus.Lec_03_Sorting;

public class countingSort {
    public static void cSort(int numbers[], int max){
        int largerst =Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            largerst = Math.max(largerst, numbers[i]);
        }
        int count[] = new int[largerst + 1];
        for(int i = 0; i<numbers.length; i++){
            count[numbers[i]]++;
        }
        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i] > 0){
                numbers[j++] = i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5, 4, 3, 2, 1};
        cSort(numbers, 5);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
// Output: 1 2 3 4 5
// Time Complexity: O(n + k) where n is the number of elements in the input array and k is the range of the input values.
// Space Complexity: O(k) where k is the range of the input values.
// Note: Counting Sort is efficient for sorting integers or objects that can be mapped to integers within a known range.
// It is not a comparison-based sort and is particularly useful when the range of input values is not significantly larger than the number of elements to be sorted.