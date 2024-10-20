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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev1 = reverse(l1);
        ListNode prev2 = reverse(l2);
        int carry = 0;
        ListNode newLN = new ListNode(-1);
        ListNode itr = newLN;
        ListNode itrToReverse = newLN;
        while(prev1!=null || prev2!=null){
            int sum = 0;
            if(prev1!=null){
                sum = prev1.val; 
                prev1=prev1.next;
            }
            if(prev2!=null){
                sum+=prev2.val;
                prev2=prev2.next;
            }
            sum = (sum+carry);
            // System.out.println(sum);

            carry = sum/10;
            sum = sum%10;
            ListNode newLN1 = new ListNode(sum);
            itr.next = newLN1;
            itr=itr.next;
        }
        if(carry==1){
            itr.next = new ListNode(1);
        }
        
        return reverse(itrToReverse.next);
    }
    
    public ListNode reverse(ListNode ll){
        ListNode head = ll;
        ListNode prev = null;
        
        while(head!=null){
            ListNode next = head.next;
            head.next=prev;
            prev = head;
            head = next; 
        }
        return prev;
    }
}