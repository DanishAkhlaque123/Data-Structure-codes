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
    public int findBottomLeftValue(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        
      //ArrayList<Integer> ans=new ArrayList<>();
        View(root, al, 0);
        return al.get(al.size()-1);
        
           
    }
    
    public void View(TreeNode root, ArrayList<Integer> al, int level)
    {
        if(root==null)
            return;
        
        if(al.size()==level)
            al.add(root.val);
        View(root.left,al,level+1);
        View(root.right,al,level+1);
            
    }
}