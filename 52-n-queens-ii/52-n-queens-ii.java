class Solution {
    int count=0;
    public void solve(boolean[][] chess,int row)
    {
        int n=chess.length;
        
        if(row==n)
        {
            count++;
          //  t++;
           // System.out.println(t);
            return;
        }
        
        for(int col=0;col<n;col++)
        {
            if(isqueensafe(chess,row,col))
            {
                chess[row][col]=true;
                solve(chess,row+1);
                chess[row][col]=false;
            }
        }
        //return count;
        
    }
    
    
    public boolean isqueensafe(boolean[][] chess,int row,int col)
    {
        int n=chess.length;
       // int dirs[][]={{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1}};
        int[][] dirs={{-1,0},{-1,-1},{1,0},{0,-1},{0,1},{1,-1},{1,1},{-1,1}};
        
        for(int dis=1;dis<=n;dis++)
        {
            for(int i=0;i<8;i++)
            {
                int rm=dirs[i][0];
                int cm=dirs[i][1];
                
                int nrow=row+rm*dis;
                int ncol=col+cm*dis;
                
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<n)
                {
                    if(chess[nrow][ncol]==true)
                        return false;
                }
            }
        }
        return true;
    }
    
    
    public int totalNQueens(int n) {
        boolean[][] chess= new boolean[n][n];
        //int count=0;
        solve(chess,0);
        //System.out.println(count);
        return count;
    }
}