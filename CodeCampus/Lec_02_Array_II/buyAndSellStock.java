package CodeCampus.Lec_02_Array_II;


public class buyAndSellStock {
    public static int buyAndSell(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int prices[] = {7, 1, 5, 3, 6, 4};
        int result = buyAndSell(prices);
        System.out.println("Maximum Profit: " + result);
    }
}

// Output: Maximum Profit: 5
// Time Complexity: O(n)
// Space Complexity: O(1)
