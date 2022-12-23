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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        inOrder(root, al);
        int i=0;
        int j=al.size()-1;
        int sum=0;
        while(i<j)
        {
            sum=al.get(i)+al.get(j);
            if(sum>k)
                j--;
            else if(sum<k)
                i++;
            else
                return true;
        }
        return false;
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