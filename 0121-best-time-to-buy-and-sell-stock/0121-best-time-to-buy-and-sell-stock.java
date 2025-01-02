class Solution {
    public int maxProfit(int[] prices) {
        int minpro=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++)
        {
            minpro=Math.min(minpro,prices[i]);
            res=Math.max(res,prices[i]-minpro);
        }
        return res;
    }
}