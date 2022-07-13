class Solution {
    public int maximalSquare(char[][] matrix) {
        int ans=0;
        int[][] arr=new int[matrix.length][matrix[0].length];
        
          for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                arr[i][j]=Integer.parseInt(matrix[i][j]+"");
             
            }
            
        }
        
        int[][] dp=new int[matrix.length][matrix[0].length];
        
        for(int i=matrix.length-1;i>=0;i--)
        {
            for(int j=matrix[0].length-1;j>=0;j--)
            {
                if(i==matrix.length-1 && j==matrix[0].length-1)
                    dp[i][j]=arr[i][j];
                else if(i==matrix.length-1)
                    dp[i][j]=arr[i][j];
                else if(j==matrix[0].length-1)
                    dp[i][j]=arr[i][j];
                else
                {
                    if(arr[i][j]==0)
                        dp[i][j]=0;
                    else
                    {
                        int min=Math.min(dp[i][j+1],dp[i+1][j]);
                            min=Math.min(min,dp[i+1][j+1]);
                                        
                        dp[i][j]=min+1;
                        //System.out.println(dp[i][j]);
                       
                    }
                }
            }
        }
         for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
              //  System.out.print(dp[i][j]);
              ans=Math.max(ans,dp[i][j]);
            }
          //  System.out.println();
        }
       // return ans*ans;
        //System.out.println(ans);
       return ans*ans;
    }
}