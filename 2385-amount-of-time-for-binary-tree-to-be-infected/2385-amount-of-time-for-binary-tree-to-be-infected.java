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
    int maxSize = 0;

    public int amountOfTime(TreeNode root, int start) {
        ArrayList<TreeNode> ntr = getRootPath(root, start);
        // if (ntr.size() == 0) {
        //     return 0;
        // }
        int size = 0;
        for (int i = 0; i < ntr.size(); i++) {
            TreeNode blocker = null;
            if (i > 0) {
                blocker = ntr.get(i - 1);
            }
            time(ntr.get(i), blocker, size+i);
        }
        return maxSize;
    }

    private void time(TreeNode root, TreeNode blocker, int size) {
        if (blocker == root || root == null) {
            return;
        }
        time(root.left, blocker, size + 1);
        time(root.right, blocker, size + 1);
         maxSize = Math.max(maxSize, size);
    }

    private ArrayList<TreeNode> getRootPath(TreeNode root, int start) {
        if (root.val == start) {
            ArrayList<TreeNode> al = new ArrayList<>();
            al.add(root);
            return al;
        }
        if (root.left != null) {
            ArrayList<TreeNode> leftTree = getRootPath(root.left, start);
            if (leftTree.size() > 0) {
                leftTree.add(root);
                return leftTree;
            }
        }
        if (root.right != null) {
            ArrayList<TreeNode> rightTree = getRootPath(root.right, start);
            if (rightTree.size() > 0) {
                rightTree.add(root);
                return rightTree;
            }
        }

        return new ArrayList<>();
    }
}
