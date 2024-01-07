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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddNode = new ListNode(-1);
        ListNode evenNode = new ListNode(-1);
        ListNode even = evenNode;
        ListNode odd = oddNode;
        int count=0;
        while(head!=null){
            if(count%2==0){
                even.next = head;
                even = even.next;
            }
            else{
                odd.next=head;
                odd=odd.next;
            }
            ListNode next = head.next;
            head.next=null;
            head=next;
            count++;     
        }
        even.next = oddNode.next;
        return evenNode.next;
    }
}