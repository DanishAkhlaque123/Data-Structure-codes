/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            al.add(temp.val);
            temp=temp.next;
        }
        
        int[] a=new int[al.size()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=al.get(i);
        }
        
        return construct(a,0,al.size()-1);
        
        
        
        
        
    }
    
    public TreeNode construct(int[] a,int si,int ei)
    {
        if(si>ei)
            return null;
        
        if(si==ei)
            return new TreeNode(a[si]);
        
        int mid=(si+ei)/2;
        TreeNode root=new TreeNode(a[mid]);
        root.left=construct(a,si,mid-1);
        root.right=construct(a,mid+1,ei);
        return root;
    }
    
}