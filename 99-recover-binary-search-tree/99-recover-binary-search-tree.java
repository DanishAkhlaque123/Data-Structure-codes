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
    ArrayList<Integer> al=new ArrayList<>();
    int i=0;
    public void recoverTree(TreeNode root) {
        
        inorder(root);
        Collections.sort(al);
        
        inorder_check(root);
        
    }
    
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        
        al.add(root.val);
        
        inorder(root.right);
    }
    
    public void inorder_check(TreeNode root)
    {
        if(root==null)
            return;
        inorder_check(root.left);
        if(al.get(i)!=root.val)
        {
            root.val=al.get(i);
            
        }
        i++;
        inorder_check(root.right);
    }
}