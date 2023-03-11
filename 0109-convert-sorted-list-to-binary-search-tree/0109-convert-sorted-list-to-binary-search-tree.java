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
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        
        int[] values=new int[al.size()];
        for(int i=0;i<al.size();i++){
            values[i]=al.get(i);
        }
        return construct(values,0,values.length-1);
        
    }
    
    public TreeNode construct(int[] values, int start, int end){
        if(start>end){
            return null;
        }
        if(start==end){
            return new TreeNode(values[start]);
        }
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(values[mid]);
        root.left=construct(values, start, mid-1);
        
        root.right=construct(values, mid+1, end);
        return root;
        
    }
}