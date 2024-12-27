class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxi=values[0];
        int mini=0;
        int ans=0;
        for(int i=1;i<values.length;i++){
            mini = values[i]-i;
            ans=Math.max(ans, maxi+mini);
            maxi = Math.max(maxi, values[i]+i);
        }
        return ans;
    }
}