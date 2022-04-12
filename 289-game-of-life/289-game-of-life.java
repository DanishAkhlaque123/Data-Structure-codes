class Solution {
    public void gameOfLife(int[][] board) {
        
        int n=board.length;
        int m=board[0].length;
        int[][] res=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                res[i][j]=board[i][j];
            }
        }
        
        int dirs[][]={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{1,-1},{-1,-1}};
        
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                int liveCells=0;
                for(int[] dir:dirs)
                {
                    int x=i+dir[0];
                    int y=j+dir[1];
                    if(x>=0 && y>=0 && x<n && y<m && res[x][y]==1)
                    {
                        liveCells++;
                    }
                }
                
                if(liveCells<2)
                    board[i][j]=0;
                else if(liveCells==2 || liveCells==3)
                {
                    if(board[i][j]==1)
                    board[i][j]=1;
                    else if(board[i][j]==0 && liveCells==3)
                        board[i][j]=1;
                }
                    else if(liveCells>3 && board[i][j]==1)
                    board[i][j]=0;
                
            }
        }
        
    }
}