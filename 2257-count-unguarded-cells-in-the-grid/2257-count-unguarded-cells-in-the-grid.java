class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] guarded = new int[m][n];

        for(int i=0;i<guards.length;i++){
            int iIdx = guards[i][0];
            int jIdx = guards[i][1];
            guarded[iIdx][jIdx]=2;
        }
        
        for(int i=0;i<walls.length;i++){
            int iIdx = walls[i][0];
            int jIdx = walls[i][1];
            guarded[iIdx][jIdx]=3;
        }
        
        for(int i=0;i<guarded.length;i++){
            for(int j=0;j<guarded[0].length;j++){
                if(guarded[i][j]==2){
                    // System.out.print(i+","+j);
                    dfs(guarded, i, j);
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // System.out.print(guarded[i][j]);
                if(guarded[i][j]==0){
                    count++;
                }
            }
            // System.out.println();
        }
        return count;
        
    }
    
    public void dfs(int[][] guarded, int i, int j){
        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int[] dir : dirs){
            if(dir[1]==0){
                for(int len=1;len<guarded.length;len++){
                    int x = i+(dir[0]*len);
                    int y = j+(dir[1]*len);
                    // System.out.println("1,0"+i+","+j+","+x+","+y);
                    if(x<0 || y<0 || x>=guarded.length || y>=guarded[0].length || guarded[x][y]==3 || guarded[x][y]==2){
                        break;
                    }
                    if(x>=0 && y>=0 && x<guarded.length && y<guarded[0].length && guarded[x][y]==0){
                        guarded[x][y]=1;
                        
                    }
                    
                }
            }
            else{
                for(int len=1;len<guarded[0].length;len++){
                    int x = i+(dir[0]*len);
                    int y = j+(dir[1]*len);
                    // System.out.println("0,1"+i+","+j+","+x+","+y);
                    if(x<0 || y<0 || x>=guarded.length || y>=guarded[0].length || guarded[x][y]==3 || guarded[x][y]==2){
                        break;
                    }
                    if(x>=0 && y>=0 && x<guarded.length && y<guarded[0].length && guarded[x][y]==0){
                        guarded[x][y]=1;
                        
                    }
                    
                } 
            }
        }

    }
}