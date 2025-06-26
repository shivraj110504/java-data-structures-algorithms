package CodeCampus.Lec_02_Array_II;

public class TrapRainWater {
    public static int trappedRainWater(int[] height){
        int n = height.length;
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        int rightMax [] = new int [n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=  0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedRainWater = 0;
        for(int i = 0; i <n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedRainWater += waterLevel - height[i];
        }
        return trappedRainWater;
    }
    public static void main(String[] args){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int result = trappedRainWater(height);
        System.out.println("Trapped Rain Water: " + result);
    }
}

// Output: Trapped Rain Water: 14
//Time Complexity: O(n)
//Space Complexity: O(n)

