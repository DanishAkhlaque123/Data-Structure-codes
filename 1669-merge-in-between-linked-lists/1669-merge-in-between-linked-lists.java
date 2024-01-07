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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ath = list1;
        ListNode bth = list1;
        ListNode finalListNode = list1;
        ListNode list2Tail=list2;
        int count1=0;
        while(count1+1!=a){
            ath=ath.next;
            count1++;
        }
        int count2=0;
        while(count2!=b){
            bth=bth.next;
            count2++;
        }
        ath.next=list2;
        
        while(list2Tail.next!=null){
            list2Tail=list2Tail.next;
        }
        if(bth.next!=null){
            bth=bth.next;
            list2Tail.next=bth;
        }
        
        return finalListNode;
        
    }
}