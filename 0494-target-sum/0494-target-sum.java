class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0);
    }
    
    public int helper(int[] nums, int target, int idx){
        if(target==0 && idx==nums.length){
            return 1;
        }
        if(nums.length==idx){
            return 0;
        }
        int ans=0;
        ans += helper(nums, target-nums[idx], idx+1);
        // System.out.println("idx->"+idx+" target->"+target+"ans=>"+ans);
        ans += helper(nums, target+nums[idx], idx+1);
        
        return ans;
    }
}