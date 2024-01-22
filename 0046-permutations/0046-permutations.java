class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pa = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        helper(vis, ans, pa, nums);
        return ans;
    }
    
    public void helper(boolean[] vis, List<List<Integer>> ans, List<Integer> pa, int[] nums){
        boolean isAllVisited = true;
        for(boolean bool : vis){
            if(!bool){
                isAllVisited = false;
            }
        }
        if(isAllVisited){
            ans.add(new ArrayList<>(pa));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                vis[i]=true;
                pa.add(nums[i]);
                helper(vis, ans, pa, nums);
                vis[i]=false;
                pa.remove(pa.size()-1);
            }
        }
    }
    
}