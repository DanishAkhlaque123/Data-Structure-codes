class Solution {
    public int climbStairs(int n) {
       int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++)
        {
          if(i<0)
            continue;
        if(i==0 ||i==1)
        {
            dp[i]=1;
            continue;
        }
        
        
        int num1=dp[i-1];//climbstairsdp(n-1,dp);
        int num2=dp[i-2];//climbstairsdp(n-2,dp);
        int ans=num1+num2;
        dp[i]=ans;  
        }
       
        return dp[n];
    }
}