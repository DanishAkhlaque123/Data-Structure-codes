class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==1){
            return nums[0];
        }
        int[] inc = new int[n];
        int[] notInc = new int[n];
        inc[0]=nums[0];
        inc[1]=0;
        
        for(int i=1;i<n;i++){
            inc[i]=notInc[i-1]+nums[i];
            notInc[i]=Math.max(inc[i-1], notInc[i-1]);
        }
        return Math.max(inc[n-1], notInc[n-1]);
    }
}