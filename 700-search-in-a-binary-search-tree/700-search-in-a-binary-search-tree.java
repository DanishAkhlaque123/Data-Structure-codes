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
    public TreeNode searchBST(TreeNode root, int val) {
       
        if(root==null)
            return null;
        
         if(root.val==val)
            return root;
        
        if(root.val<val)
        {
           TreeNode ansNodeRight = searchBST(root.right,val);
            if(ansNodeRight != null)
            return ansNodeRight;
        }
        else
        {
          TreeNode ansNodeLeft = searchBST(root.left,val);
              if(ansNodeLeft!=null)
            return ansNodeLeft;
        }
        
        
       
        return null;
    }
}