/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> p1=helper(root,p);
        ArrayList<TreeNode> q1=helper(root,q);
        int l1=p1.size()-1;
        int l2=q1.size()-1;
        while(l1>=0 && l2>=0 && p1.get(l1)==q1.get(l2))
        {
            l1--;
            l2--;
            
        }
        TreeNode t1=new TreeNode();
        t1.val=p1.get(++l1).val;
        return t1;
    }
    
    public ArrayList<TreeNode> helper(TreeNode root, TreeNode target)
    {
        if(root==target)
        {
            ArrayList<TreeNode> b=new ArrayList<>();
            b.add(target);
            return b;
        }
        
        if(root.left!=null)
        {
            ArrayList<TreeNode> al1=helper(root.left,target);
            if(al1.size()>0)
            {
                al1.add(root);
                return al1;
    
            }
                
        }
        
         if(root.right!=null)
        {
            ArrayList<TreeNode> al2=helper(root.right,target);
            if(al2.size()>0)
            {
                al2.add(root);
                return al2;
    
            }
                
        }
        
        return new ArrayList<>();
        
    }
}