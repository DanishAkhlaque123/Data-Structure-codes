class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return helper(nums, k, 0, new HashSet<>());
    }
    
    public int helper(int[] nums, int k, int i, HashSet<Integer> set){
        if(i==nums.length){
            return set.isEmpty() ? 0 : 1;
        }
        int val = helper(nums, k, i+1,set);
        if(set.contains(nums[i]-k)){
            return val;
        }
        set.add(nums[i]);
        val += helper(nums, k, i+1, set);
        set.remove(nums[i]);
        return val;
        
    }
}