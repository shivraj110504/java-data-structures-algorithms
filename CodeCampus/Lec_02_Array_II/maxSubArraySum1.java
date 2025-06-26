package CodeCampus.Lec_02_Array_II;

public class maxSubArraySum1 {
    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<= end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
    public static void main(String[] args){
        int numbers[] = {2, -4, 6, -8, 10};
        maxSubarraySum(numbers);
    }
}

// maxSubArraySum.java
// This code is part of the Array_II package and defines a class to find the
// This code finds the maximum subarray sum using a brute force approach.
// It iterates through all possible subarrays and calculates their sums, keeping track of the maximum sum found.
// This is a brute force solution with O(n^3) time complexity.