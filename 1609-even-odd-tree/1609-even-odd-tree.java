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

    public boolean isEvenOddTree(TreeNode root) {
        return bfs(root);
    }

    private boolean bfs(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while (queue.size() > 0) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.removeFirst();
                System.out.print(node.val+" ");
                if (level % 2 == 0 && node.val % 2 != 1) {
                    return false;
                } else if (level % 2 == 1 && node.val % 2 == 1) {
                    return false;
                } else if (level%2==1 && node.val >= max) {
                    return false;
                }
                else if (level%2==0 && node.val <= min) {
                    return false;
                }
                if(level%2==0){
                    min=node.val;
                }
                else if(level%2==1){
                    max=node.val;
                }
                
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            level++;
            max=Integer.MAX_VALUE;
            min=Integer.MIN_VALUE;
            System.out.println();
        }
        return true;
    }
}
