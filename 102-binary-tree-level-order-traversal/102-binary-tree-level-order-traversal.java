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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        LinkedList<TreeNode> que=new LinkedList<>();
        que.addLast(root);
        while(que.size()>0)
        {
            int size=que.size();
            List<Integer> nl=new ArrayList<>();
            while(size-->0)
            {
                TreeNode t=que.removeFirst();
                nl.add(t.val);
                if(t.left!=null)
                {
                    que.addLast(t.left);
                }
                if(t.right!=null)
                {
                    que.addLast(t.right);
                }
                
            }
            ans.add(nl);
        }
        return ans;
    }
}