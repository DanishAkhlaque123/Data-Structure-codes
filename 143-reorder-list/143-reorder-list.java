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
    public void reorderList(ListNode head) {
        if(head.next!=null)
        {
             ListNode mid1=mid(head);
        ListNode reversed=reverse(mid1);
        ListNode travel=head;
        
        while(reversed!=null)
        {
            ListNode next=travel.next;
            travel.next=reversed;
            
            travel=next;
            ListNode down=reversed.next;
            reversed.next=travel;
            reversed=down;
            
            
        }
        }
            
        
       
        
        
    }
    
    public ListNode mid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode Next=slow.next;
        slow.next=null;
        return Next;
    }
    
    public ListNode reverse(ListNode Node1)
    {
        ListNode prev=null;
        ListNode curr=Node1;
        ListNode temp=Node1;
        
        while(curr.next!=null)
        {
            ListNode nextnode=temp.next;
            curr.next=prev;
            curr=nextnode;
            prev=temp;
            temp=nextnode;
            
        }
        curr.next=prev;
        
       return curr;
    }
}