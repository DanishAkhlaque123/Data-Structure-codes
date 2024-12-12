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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> hs = new HashSet<>();
        for(int val : nums){
            hs.add(val);
        }
        // System.out.println(hs);
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode itr = dummy;
        
        while(itr.next!=null){
            if(hs.contains(itr.next.val)){
                if(itr.next.next!=null){
                    itr.next = itr.next.next;
                }
                else{
                    itr.next=null;
                }
            }
            else{
             itr = itr.next;   
            }
        }
        return dummy.next;
    }
}