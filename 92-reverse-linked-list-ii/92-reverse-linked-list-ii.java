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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
            return head;
        
        while(left<right)
        {
            ListNode left_val=getnode(left,head);
            ListNode right_val=getnode(right,head);
            
            int temp=left_val.val;
            left_val.val=right_val.val;
            right_val.val=temp;
                
            left++;
            right--;
            
        }
        return head;
        
    }
    
    
    public ListNode getnode(int n, ListNode head)
    {
        ListNode itr=head;
       for(int i=0;i<n-1;i++)
       {
           itr=itr.next;
       }
        return itr;
    }
    
}