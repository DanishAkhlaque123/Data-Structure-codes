class Solution {
    public int[] sortArray(int[] nums) {
        int left=0;
        int right=nums.length-1;
        return mergeSort(nums, left, right);
    }

    public int[] mergeSort(int[] nums,int left, int right)
    {
        if(left==right){
            int[] b = new int[1];
            b[0] = nums[right];
            return b;
        }
    
        int mid = (left+right)/2;
        
        int[] leftSorted=mergeSort(nums,left,mid);
        int[] rightSorted=mergeSort(nums,mid+1,right);
        return mergeTwoSortedArray(leftSorted, rightSorted);
    }

    public int[] mergeTwoSortedArray(int[] leftSorted, int[] rightSorted)
    {
        int n=leftSorted.length;
        int m=rightSorted.length;
        int[] ans=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(leftSorted[i]<rightSorted[j]){
                ans[k]=leftSorted[i];
                i++;
            }
            else{
                ans[k]=rightSorted[j];
                j++;
            }
            k++;
        }
        
        while(i<n){
            ans[k]=leftSorted[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=rightSorted[j];
            j++;
            k++;
        }
        return ans;
        
    }
}