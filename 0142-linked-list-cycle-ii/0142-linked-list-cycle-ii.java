/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head == null)
            return head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast.next==null || fast.next.next==null){
            return null;
        }
        
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}