class Solution {
   int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int srow=0;
        int erow=grid.length-1;
        int scol=0;
        int ecol=grid[0].length-1;
        for(int i=0;i<=erow;i++)
        {
            for(int j=0;j<=ecol;j++)
            {
                if(grid[i][j]==1)
                {
                    
                    int t=dfs(grid,i,j);
                        count=Math.max(count,t);
                    
                 }
            }
        }
        return count;
    }
    
    public int dfs(int[][] grid, int i, int j)
    {
        grid[i][j]=0;
        int[][] dirs={{0,1},{1,0},{0,-1},{-1,0}};
         int ans=0;
        for(int[] dir:dirs)
        {
            int x=i+dir[0];
            int y=j+dir[1];
            if(x>=0 && x<=grid.length-1 && y>=0 && y<=grid[0].length-1 && grid[x][y]==1)
            {
                
               ans+= dfs(grid,x,y);
            }
           
        }
        return ans+1;
        
    }
    
}