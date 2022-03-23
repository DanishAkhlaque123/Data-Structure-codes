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
    public ListNode deleteDuplicates(ListNode head) {
        
       if(head==null)
           return head;
            
        ListNode temp=head;
        ListNode temp1=head;
        ListNode Next;
        while(temp1.next!=null)
        {
            Next=temp1.next;
            temp1.next=null;
            temp1=Next;
            
            if(temp.val!=temp1.val)
            {
                temp.next=Next;
                temp=temp.next;
            }
            
        }
        return head;
        
    }
}