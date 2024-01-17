/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int max = Integer.MIN_VALUE;
        int rootIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                rootIndex = i;
            }
        }
        return helper(nums, rootIndex, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int rootIndex, int left, int right) {
        if (left == right) {
            return new TreeNode(nums[rootIndex]);
        }
        if (rootIndex < 0 || rootIndex>nums.length-1) {
            return null;
        }

        TreeNode root = new TreeNode(nums[rootIndex]);
        int maxIndexLeft = findMaxIndex(nums, rootIndex, left, rootIndex - 1);
 
        root.left = helper(nums, maxIndexLeft, left, rootIndex - 1);
        int maxIndexRight = findMaxIndex(nums, rootIndex, rootIndex + 1, right);
        root.right = helper(nums, maxIndexRight, rootIndex + 1, right);
        return root;
    }

    public int findMaxIndex(int[] nums, int root, int left, int right) {
        int maxIndex = -1;
        int maxVal = -1;
        for (int i = left; i <= right; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
