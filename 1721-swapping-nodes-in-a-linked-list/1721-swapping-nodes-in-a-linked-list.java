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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode slow=head;
        ListNode slow1=head;
        ListNode fast=head;
        
        int count=k-1;
        int count1=k-1;
        while(count>0)
        {
            slow=slow.next;
            count--;
        }
         
        while(count1>0)
        {
            slow1=slow1.next;
            count1--;
        }
        
        
        while(slow1.next!=null)
        {
            slow1=slow1.next;
            fast=fast.next;
        }
        
        
        int temp=slow.val;
        slow.val=fast.val;
        fast.val=temp;
        return head;
        
        
        
    }
}