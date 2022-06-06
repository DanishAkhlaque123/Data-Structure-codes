class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
       return  Math.min(helper(n-1,cost,dp),helper(n-2,cost,dp));
        
    }
    
  private static int helper(int N , int[] cost,int[] dp){
        if(N == 0 || N == 1) return dp[N]= cost[N];
      if(dp[N]!=-1)
          return dp[N];
        int oneStep = helper(N-1,cost,dp);
        int twoStep = helper(N-2,cost,dp);
        
        return dp[N]=cost[N]+Math.min(oneStep,twoStep);
    }
}