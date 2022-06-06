/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lena=0;
        ListNode lna=headA;
        while(lna!=null)
        {
            lena++;
            lna=lna.next;
        }
        
        int lenb=0;
        ListNode lnb=headB;
        while(lnb!=null)
        {
            lenb++;
            lnb=lnb.next;
        }
        
         ListNode lna1=headA;
         ListNode lnb1=headB;
        int diff=Math.abs(lena-lenb);
        
        if(lena>lenb)
        {
            while(diff-->0)
            {
                lna1=lna1.next;
            }
        }else
        {
             while(diff-->0)
            {
                lnb1=lnb1.next;
            }
        }
        
        while(lna1 != lnb1)
        {
            if(lna1==null || lnb1==null)
                return null;
            lna1=lna1.next;
            lnb1=lnb1.next;
        }
        return lna1;
        
        
    }
    
    /* public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode  tempA = headA;
        while(tempA != null){
            lenA++;
            tempA = tempA.next;
        }
        
        int lenB = 0;
        ListNode tempB = headB;
        while(tempB != null){
            lenB++;
            tempB = tempB.next;
        }
        
        
        int diff = Math.abs(lenA-lenB);
        
        tempA = headA;
        tempB = headB;
        
        if(lenA > lenB){
            while(diff--> 0)
                tempA = tempA.next;
            
        }else{
            while(diff--> 0)
                tempB = tempB.next;
            
        }
        
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
            if(tempA == null || tempB == null)
                return null;
        }
        return tempB;
    }
}*/
}