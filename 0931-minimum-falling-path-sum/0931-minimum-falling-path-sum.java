class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dpArray = new int[n][m];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<m;j++){
                if(i==n-1){
                    dpArray[i][j]=matrix[i][j];
                }
                else if(j==m-1){
                    dpArray[i][j] = Math.min(dpArray[i+1][j], dpArray[i+1][j-1])+matrix[i][j];
                }
                else if(j==0){
                    dpArray[i][j] = Math.min(dpArray[i+1][j], dpArray[i+1][j+1])+matrix[i][j]; 
                }
                else{
                    dpArray[i][j] = Math.min(Math.min(dpArray[i+1][j], dpArray[i+1][j-1]), dpArray[i+1][j+1])+matrix[i][j];
                }
            }
        }
        int ans=(int)(1e8);
        for(int val : dpArray[0]){
            ans=Math.min(ans, val);
        }
        return ans;
    }
}