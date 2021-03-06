class Solution {
    public int maxProfit(int[] prices, int fee) {
             int dpi0=0;
        int dpi1=-(int)(1e9);
        for(int i=0;i<prices.length;i++)
        {
            int dpi10=dpi0;
            dpi0=Math.max(dpi0,dpi1+prices[i]);
            dpi1=Math.max(dpi1,dpi10-prices[i]-fee);
        }
        return dpi0;
    }
}