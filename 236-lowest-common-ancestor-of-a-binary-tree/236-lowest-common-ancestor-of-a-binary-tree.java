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
        ArrayList<TreeNode> lca1=lca(root,p);
        ArrayList<TreeNode> lca2=lca(root,q);
        
        
        int n=lca1.size()-1;
        int m=lca2.size()-1;
        while(n>=0 && m>=0 && lca1.get(n)==lca2.get(m))
        {
            n--;
            m--;
        }
        TreeNode t1=new TreeNode();
        t1.val=lca1.get(++n).val;
        return t1;
    }
    
    public ArrayList<TreeNode> lca(TreeNode root, TreeNode p1)
    {
        if(root==p1)
        {
            ArrayList<TreeNode> al=new ArrayList<>();
            
            al.add(p1);
            return al;
            
        }
        ArrayList<TreeNode> left1=new ArrayList<>();
        ArrayList<TreeNode> right1=new ArrayList<>();
        if(root.left!=null)
        left1=lca(root.left,p1);
        if(left1.size()>0)
        {
            left1.add(root);
            return left1;
        }
        if(root.right!=null)
        right1=lca(root.right,p1);
         if(right1.size()>0)
        {
            right1.add(root);
            return right1;
        }
        return new ArrayList<>();
        
    }
    
}