package CodeCampus.Lec_02_Array_II;

public class maxSubArraySum2 {
    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length ];
        prefix[0] = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
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

// This code is part of the Array_II package and defines a class to find the
// maximum subarray sum using a prefix sum array.
// It calculates the prefix sums first, then uses them to compute the sum of any subarray in O(1) time.
// This reduces the time complexity to O(n^2) for finding the maximum subarray sum.
// The prefix sum array allows for efficient calculation of subarray sums, improving performance over the brute force method.
