class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1){
            System.out.println("List too small or empty.");
            return 0;
        }
        int cheapest = prices[0];
        int maxProfit = 0;
        int todayProfit = 0;

        for (int i = 1; i < prices.length; i++){
            if (cheapest>prices[i]){
                cheapest = prices[i];
            }
            else{
                todayProfit = prices[i] - cheapest;
                if (todayProfit>maxProfit){
                    maxProfit = todayProfit;
                }
            }
        } return maxProfit;
    } 
}