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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                pq.add(temp.val);  
                temp=temp.next;
            }
            
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode temp=dummy;
        while(pq.size()>0){
            ListNode next=new ListNode(pq.remove());
            temp.next=next;
            temp=temp.next;
        }
       return dummy.next;
    }
}