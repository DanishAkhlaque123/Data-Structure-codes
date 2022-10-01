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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode();
        dummy.val=-1;
        ListNode itr=head;
        ListNode itr1=dummy;
        while(itr!=null)
        {
            
            if(itr.val<x)
            {
                ListNode dummy1=new ListNode(itr.val);
                
                itr1.next=dummy1;
                itr1= itr1.next;
            }
            itr=itr.next;
        }
        
        ListNode itr2=head;
        while(itr2!=null)
        {
            
            if(itr2.val>=x)
            {
                ListNode dummy1=new ListNode(itr2.val);
                itr1.next=dummy1;
                itr1=itr1.next;
                
            }
            itr2=itr2.next;
        }
        
        return dummy.next;
        
    }
}