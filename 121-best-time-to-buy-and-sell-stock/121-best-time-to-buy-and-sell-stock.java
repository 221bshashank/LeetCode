class Solution {
    public int maxProfit(int[] prices) {
        int leastBuy=Integer.MAX_VALUE;
        int tProfit=0;
        int BProfit=0;
        
        for (int i=0;i<prices.length;i++)
        {
            if (prices[i]<leastBuy)
            {
                leastBuy=prices[i];
            }
            tProfit=prices[i]-leastBuy;
            if (BProfit<tProfit)
            {
                BProfit=tProfit;
            }
        }
        return BProfit;
       
}
}