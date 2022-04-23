class Solution {
    
    public int tab(int n, int[] nums)
    {
        int[] dp=new int[n];
        for(int idx=n-1;idx>=0;idx--)
        {
            if(idx==n-1){
                dp[idx]=0;
                continue;
            }
            
            int ans=(int)(1e8);
            int jumps_allowed=nums[idx];
            for(int j=1;j<=jumps_allowed && j+idx<n;j++)
            {
                ans=Math.min(ans,dp[idx+j]);
            }
            dp[idx]=ans+1;
        }
        
        return dp[0];
    }
    public int jump(int[] nums) {
        return tab(nums.length,nums);
    }
}