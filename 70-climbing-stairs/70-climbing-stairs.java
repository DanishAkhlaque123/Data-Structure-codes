class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return climbstairsdp(n,dp);
        
        
    }
    
    public int climbstairsdp(int n,int[] dp)
    {
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        
        int num1=climbstairsdp(n-1,dp);
        int num2=climbstairsdp(n-2,dp);
        int ans=num1+num2;
        dp[n]=ans;
        return ans;
    }
}