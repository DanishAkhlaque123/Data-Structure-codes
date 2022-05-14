class Solution {
       public int lcs(String text1, String text2,int n, int m)
    {
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0)
                    dp[i][j]=j;
                else if(j==0)
                    dp[i][j]=i;
                else if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                {
                    int insert=dp[i][j-1];
                    int delete=dp[i-1][j];
                    int replace=dp[i-1][j-1];
                    
                    dp[i][j]=Math.min(insert,Math.min(delete, replace))+1;
                }
                
                
                }
        }
           return dp[n][m];
       }
    
    
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
      return  lcs(word1,word2,n,m);
    }
}