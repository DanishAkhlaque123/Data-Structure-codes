class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean flag=false;
        if(matrix[n-1][m-1]<target){
            return false;
        }
        int targetRow=0;
        for(int i=1;i<n;i++){
            if(matrix[i][0]>target){
                targetRow=i-1;
                flag=true;
                break;
            }
        }
        if(flag==false){
            targetRow=n-1;
        }
        System.out.println(targetRow);
        int[] rowToCheck = matrix[targetRow];
        boolean ans = checkTarget(rowToCheck, target, 0, m-1);
        return ans;
    }
    public boolean checkTarget(int[] rowToCheck, int target, int left, int right){
        while(left<=right){
          int mid = (left+right)/2;
//            System.out.println(mid);
        if(rowToCheck[mid]==target){
            return true;
        }
        if(rowToCheck[mid]<target){
            left = mid+1;
        } 
         else if(rowToCheck[mid]>target){
             right = mid-1;   
        }
    }
        return false;
        
    }
}