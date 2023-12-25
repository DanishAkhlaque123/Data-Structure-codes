class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int leftColumn=0;
        int upperRow=0;
        int rightColumn=matrix[0].length-1;
        int lowerRow=matrix.length-1;
        int count=0;
        int n=matrix[0].length;
        int m=matrix.length;
        List<Integer> ans = new ArrayList<>();
    
        while(count!=m*n){
            for(int i=leftColumn;i<=rightColumn && count!=m*n;i++){
                ans.add(matrix[upperRow][i]);
                // System.out.println(matrix[upperRow][i]);
                count++;
            }
            upperRow++;
            
            for(int i=upperRow;i<=lowerRow && count!=m*n;i++){
                ans.add(matrix[i][rightColumn]);
                // System.out.println(matrix[i][rightColumn]);
                count++;
            }
            rightColumn--;
            
            for(int i=rightColumn;i>=leftColumn && count!=m*n;i--){
                ans.add(matrix[lowerRow][i]);
                // System.out.println(matrix[lowerRow][i]);
                count++;
            }
            lowerRow--;
            
            for(int i=lowerRow;i>=upperRow && count!=m*n;i--){
                ans.add(matrix[i][leftColumn]);
                // System.out.println(matrix[i][leftColumn]);
                count++;
            }
            leftColumn++;
        }
        return ans;
    }
}