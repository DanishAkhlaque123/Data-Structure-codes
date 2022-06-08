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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
           if(root==null)
            return new ArrayList<>();
        int count=0;
        LinkedList<TreeNode> que=new LinkedList<>();
        que.addLast(root);
        while(que.size()>0)
        {
            count++;
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
            if(count%2==0)
            {
                List<Integer> newl=new ArrayList<>();
                for(int i=nl.size()-1;i>=0;i--)
                {
                    newl.add(nl.get(i));
                    
                }
               ans.add(newl);
            }
            else
            ans.add(nl);
        }
        return ans;
    }
}