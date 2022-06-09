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
    
    public TreeNode helper(int[] pre,int psi,int pei,int[] ino,int isi,int iei)
    {
        if(psi>pei)
        {
            return null;
        }
        if(psi==pei)
        {
            return new TreeNode(pre[psi]);
        }
        
        TreeNode root=new TreeNode(pre[psi]);
        int j=isi;
        int count=0;
        while(ino[j]!=root.val)
        {
            j++;
            count++;
        }
        
        root.left=helper(pre,psi+1,psi+count,ino,isi,j-1);
        root.right=helper(pre,psi+count+1,pei,ino,j+1,iei);
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
}