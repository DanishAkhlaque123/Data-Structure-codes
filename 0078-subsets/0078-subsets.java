class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public List<Integer> helper(int[] nums, int idx, List<Integer> al, List<List<Integer>> ans) {
        if (idx == nums.length) {
            // System.out.println(al);
            ans.add(new ArrayList<>(al));
            return al;
        }

        List<Integer> newal = helper(nums, idx + 1, al, ans);

        newal.add(nums[idx]);
        helper(nums, idx + 1, newal, ans);
        al.remove(al.size() - 1);
        return al;
    }
}
