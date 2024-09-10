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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode firstVal = head;
        while(firstVal.next!=null){
            ListNode next = firstVal.next;
            ListNode secondVal = next;
            ListNode hcf = findHCF(firstVal, secondVal);
            firstVal.next=hcf;
            hcf.next = next;
            firstVal = firstVal.next.next;
        }
        return head;
    }
    
    public ListNode findHCF(ListNode firstVal, ListNode secondVal){
        int dividend = firstVal.val;
        int divisor = secondVal.val;
        while(dividend%divisor!=0){
            int remainder = dividend%divisor;
            dividend = divisor;
            divisor = remainder;
        }
        
        return new ListNode(divisor);
    }
}