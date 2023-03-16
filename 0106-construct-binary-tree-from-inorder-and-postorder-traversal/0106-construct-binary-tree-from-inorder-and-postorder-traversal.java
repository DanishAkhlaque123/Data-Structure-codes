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
     public TreeNode helper(int[] ino,int isi,int iei,int[] pos,int posi,int poei)
    {
        if(isi>iei)
        {
            return null;
        }
        if(isi==iei)
        {
            return new TreeNode(ino[isi]);
        }
        
        TreeNode root=new TreeNode(pos[poei]);
        int j=isi;
        int count=0;
        while(ino[j]!=root.val)
        {
            j++;
            count++;
        }
        
        root.left=helper(ino,isi,j-1,pos,posi,posi+count-1);
        root.right=helper(ino,j+1,iei,pos,posi+count,poei-1);
        return root;
    }
    
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    
}