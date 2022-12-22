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
    
    public List<Integer> largestValues(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        LinkedList<TreeNode> queue=new LinkedList<>();
        //al.add(root.val);
        queue.add(root);
        while(queue.size()>0)
        {
            int size=queue.size();
            int max=Integer.MIN_VALUE;
            while(size-->0)
            {
                TreeNode t=queue.removeFirst();
                if(t.val>max)
                    max=t.val;
                if(t.left!=null)
                    queue.addLast(t.left);
                if(t.right!=null)
                    queue.addLast(t.right);
            }
            al.add(max);
        }
        return al;
        
    }
}