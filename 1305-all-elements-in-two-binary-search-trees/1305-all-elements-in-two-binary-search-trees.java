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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        
        inOrder(root1,al1);
        inOrder(root2,al2);
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        int i=0;
        int j=0;
        while(i<al1.size() && j<al2.size())
        {
            if(al1.get(i)<=al2.get(j))
            {
                ans.add(al1.get(i));
                i++;
            }
            else if(al1.get(i)>al2.get(j))
            {
                ans.add(al2.get(j));
                j++;
            }
        }
        
        while(al1.size()!=i)
        {
            ans.add(al1.get(i));
            i++;
        }
            
        
        while(al2.size()!=j)
        {
            ans.add(al2.get(j));
            j++;
        }
            
        return ans;
    }
    
    public void inOrder(TreeNode root, ArrayList<Integer> al)
    {
        if(root==null)
            return;
        inOrder(root.left,al);
        al.add(root.val);
        inOrder(root.right,al);
    }
    
}