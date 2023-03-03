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
        ListNode dummy=new ListNode(-1);
        ListNode itr1=dummy;
        ListNode itr=head;
        
        while(itr!=null){
            if(itr.next!=null && itr.next.val==itr.val){
                ListNode temp=itr;
                while(temp!=null && temp.val==itr.val){
                    temp=temp.next;
                }
                itr=temp;
            }
            else{
                ListNode next=itr.next;
            
                itr1.next=itr;
                
                itr.next=null;
                
                itr=next;
                itr1=itr1.next;
                
            }
            
        }
        return dummy.next;
    }
}