class Solution {
    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];
        for(int j=m-1;j>=0;j--){
            for(int i=0;i<n;i++){
                if(j==m-1){
                    continue;
                }
                else if(i==0){
                    if(grid[i][j]<grid[i][j+1]){
                        ans[i][j]=ans[i][j+1]+1;
                    }
                    if(grid[i][j]<grid[i+1][j+1]){
                        ans[i][j]=Math.max(ans[i][j], ans[i+1][j+1]+1);
                    }
                }
                else if(i==n-1){
                    if(grid[i][j]<grid[i][j+1]){
                        ans[i][j]=ans[i][j+1]+1;
                    }
                    if(grid[i][j]<grid[i-1][j+1]){
                        ans[i][j]=Math.max(ans[i][j], ans[i-1][j+1]+1);
                    }
                }
                else{
                    if(grid[i][j]<grid[i-1][j+1]){
                        ans[i][j]=ans[i-1][j+1]+1;
                    }
                    if(grid[i][j]<grid[i][j+1]){
                        ans[i][j]=Math.max(ans[i][j], ans[i][j+1]+1);
                    }
                    if(grid[i][j]<grid[i+1][j+1]){
                        ans[i][j]=Math.max(ans[i][j], ans[i+1][j+1]+1);
                    }
                    
                }
            }
        }
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(ans[i][j]);
//             }
//             System.out.println();
//         }
        
        int result=0;
        for(int j=0;j<n;j++){
            result = Math.max(result, ans[j][0]);
        }
        return result;
    }
}