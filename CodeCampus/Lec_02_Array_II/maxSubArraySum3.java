package CodeCampus.Lec_02_Array_II;

public class maxSubArraySum3 {
    public static void kadanes(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
    public static void main(String[] args){
        int numbers[] = {2, -4, 6, -8, 10};
        kadanes(numbers);
    }
}

// This code is part of the Array_II package and defines a class to find the
// maximum subarray sum using Kadane's algorithm.
// It iterates through the array, maintaining a current sum and updating the maximum sum found.
// If the current sum becomes negative, it resets to zero, allowing for the discovery of new potential maximum subarrays.
// This approach has a time complexity of O(n), making it efficient for large arrays.


//if all numerr in arrary are negative, the maximum subarray sum will be the largest single element in the array.
// In this case, the algorithm will still return the largest negative number as the maximum subarray sum.


// public static void kadanes(int[] arr) {
//     int currSum = arr[0];
//     int maxSum = arr[0];

//     for (int i = 1; i < arr.length; i++) {
//         currSum = Math.max(arr[i], currSum + arr[i]);
//         maxSum = Math.max(maxSum, currSum);
//     }

//     System.out.println("Maximum Subarray Sum: " + maxSum);
// }

