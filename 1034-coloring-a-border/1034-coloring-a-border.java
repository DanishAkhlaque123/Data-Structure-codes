class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        dfs(grid,row,col,grid[row][col]);
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]<0){
                    grid[i][j]=color;
                }
            }
        }
        return grid;
    }
    
    public void dfs(int[][] grid,int row,int col,int clr)
    {
        grid[row][col]=-clr;
        
        int[][] dirs={{0,1},{-1,0},{0,-1},{1,0}};
        int count=0;
        for(int[] dir:dirs)
        {
            int x=row+dir[0];
            int y=col+dir[1];
            if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || Math.abs(grid[x][y])!=clr)
            {
                continue;
            }
            count++;
            if(grid[x][y]==clr)
            {
                grid[x][y]=-clr;
                dfs(grid,x,y,clr);
            }
            
        }
        if(count==4)
        {
            grid[row][col]=clr;
            
        }
    }
}