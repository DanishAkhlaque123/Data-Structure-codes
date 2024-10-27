class Solution {
    int ans=0;
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> index = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    index.add(i*m+j);
                }       
            }
        }
        ans+=index.size();
        for(int i=1;i<Math.min(n,m);i++){
            for(int j=0;j<index.size();j++){
                int val = index.get(j);
                int x = val/m;
                int y = val%m;
                if(x+i<n && y+i<m){
                ans += helper(matrix, x+i, y+i, x, y) ? 1 : 0;
                // System.out.println(ans);
                }
            }    
        }
        return ans;
    }
    
    public boolean helper(int[][] matrix, int dr, int dc, int sr, int sc){
        // System.out.println("sr->"+sr+":sc->"+sc+":dr->"+dr+":dc->"+dc);
        for(int i=sr;i<=dr;i++){
            for(int j=sc;j<=dc;j++){
                // System.out.println("Inside Loop : "+i+",j"+j);
                if(matrix[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    } 
    
}