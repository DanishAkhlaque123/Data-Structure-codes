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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
        
    }
    
    public TreeNode build(int[] preorder,int psi, int pei, int[] inorder, int isi, int iei)
    {
        if(psi>pei)
            return null;
        if(psi==pei)
            return new TreeNode(preorder[psi]);
        
        TreeNode root=new TreeNode(preorder[psi]);
        
        int j=isi;
        int count=0;
        while(inorder[j]!=root.val)
        {
            j++;
            count++;
        }
        
        root.left=build(preorder,psi+1,psi+count, inorder, isi, j-1);
        root.right=build(preorder,psi+count+1,pei, inorder, j+1, pei);
        return root;
        
    }
}