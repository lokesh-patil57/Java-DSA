package Arrays.Questions;

public class ProfitStocks {
    public static int maxProfit(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) {
            int sellingP = prices[i];
            if (buyPrice<sellingP) { // calulating profit
                int profit = sellingP - buyPrice;  // todays profit
                maxProfit = Math.max(maxProfit, profit); //global maximum profit
            } else {
                buyPrice = sellingP; 
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4}; 
        System.out.println(maxProfit(prices));

    }
}
