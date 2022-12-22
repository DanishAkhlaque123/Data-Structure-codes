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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        traverseBST(root);
        return sum;
    }
    
    public void traverseBST(TreeNode node)
    {
        if(node==null)
            return;
        if(node.left!=null && node.left.left==null && node.left.right==null)
            sum+=node.left.val;
        traverseBST(node.left);
        traverseBST(node.right);
    }
    
}