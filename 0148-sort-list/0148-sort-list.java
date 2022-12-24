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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next=null;
        left = sortList(left);
        right = sortList(right);
        
        ListNode ans  = merge(left,right);
        return ans;
        
    }
    
    
    public ListNode getMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
		ListNode dummy=new ListNode(-1);
        ListNode ai=dummy;
        ListNode ui=l1;
        ListNode li=l2;
        while(ui!=null && li!=null)
        {
            if(ui.val<li.val)
            {
                ai.next=ui;
                ui=ui.next;
                
            }
            else
            {
                ai.next=li;
                li=li.next;
            }
            ai=ai.next;
            
        }
        
        if(ui!=null)
            ai.next=ui;
        if(li!=null)
            ai.next=li;
        return dummy.next;
    }
    
    
}