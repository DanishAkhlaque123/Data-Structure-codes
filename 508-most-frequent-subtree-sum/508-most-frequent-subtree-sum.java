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
    HashMap<Integer,Integer> hm=new HashMap<>();
    int max=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        helper(root);
       for(int i:hm.keySet())
       {
           int t=hm.get(i);
           if(t>max)
               max=t;
       }
        
        
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:hm.keySet())
        {
            int t1=hm.get(i);
            if(t1==max)
                al.add(i);
        }
        
        int[] res=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            res[i]=al.get(i);
        }
        return res;
            
        
    }
    
    public int  helper(TreeNode root)
    {
        if(root==null)
            return 0;
        int ans=0;
        int ls=helper(root.left);
        int rs=helper(root.right);
        ans=ls+rs+root.val;
        if(hm.containsKey(ans))
        {
            hm.put(ans,hm.get(ans)+1);    
        }
        else
        {
            hm.put(ans,1);
        }
        return ans;
    }
    
}