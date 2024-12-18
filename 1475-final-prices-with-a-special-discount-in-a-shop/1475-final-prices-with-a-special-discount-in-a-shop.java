class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int val = prices[i];
            int j=i+1;
            while(j<prices.length){
                if(prices[j]<=val){
                    val -= prices[j];
                    break;
                }
                j++;
            }
            ans[i]=val;
        }
        return ans;
    }
}