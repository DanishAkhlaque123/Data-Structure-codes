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
    
    public int sumNumbers(TreeNode root) {
        helper(root,root.val+"");
        return sum;
    }
    
    public void helper(TreeNode root, String toAdd){
        if(root.left==null && root.right==null){
            int addToSum=Integer.parseInt(toAdd);
            //System.out.println(addToSum);
            sum+=addToSum;
            return;
        }
        
       
        if(root.left!=null)
        helper(root.left,toAdd+root.left.val);
        if(root.right!=null)
        helper(root.right,toAdd+root.right.val);
    }
    
}