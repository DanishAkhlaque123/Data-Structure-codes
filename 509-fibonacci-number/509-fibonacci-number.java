class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        return fibdp(n,dp);
        
    }
    
    
    public int fibdp(int n,int[] dp)
    {
        if(n==0 || n==1)
            return n;
        if(dp[n]!=0)
            return dp[n];
        
        dp[n]= fibdp(n-1,dp)+fibdp(n-2,dp);
        return dp[n];
    }
}