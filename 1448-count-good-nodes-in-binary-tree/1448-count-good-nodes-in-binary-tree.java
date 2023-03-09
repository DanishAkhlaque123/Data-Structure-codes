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
    int ans=1;
    public int goodNodes(TreeNode root) {
        
        helper(root, root.val);
        return ans;
    }
    
    public void helper(TreeNode root, int max){
        if(root.left!=null && root.left.val>=max){
            ans++;
            System.out.println(root.left.val);
        }
        if(root.right!=null && root.right.val>=max){
            ans++;
            System.out.println(root.right.val);
        }
        if(root.left!=null)
        helper(root.left, Math.max(max, root.left.val));
        if(root.right!=null)
        helper(root.right, Math.max(max, root.right.val));
    }
}