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
    ArrayList<TreeNode> al=new ArrayList<>();
    
    public void flatten(TreeNode root) {
        if(root==null)
            return ;
            rec(root);  
        
        int i=1;
        TreeNode temp=root;
        while(i!=al.size())
        {
            temp.left=null;
            temp.right=al.get(i);
            temp=temp.right;
            i++;
        }
    }
    
    public void rec(TreeNode root)
    {
        
        if(root==null)
            return;
        
        al.add(root);
        rec(root.left);
        rec(root.right);
    }
    
}