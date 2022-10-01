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

//-------------------------Very good solution-----------------------
/*class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        
        //skipping the first left - 1 nodes;
        ListNode curr = head;
        ListNode prev = null;
        for(int i=0;curr!=null && i<left-1;i++){
            prev = curr;
            curr = curr.next;
        }
        
        ListNode last = prev;
        ListNode newEnd = curr;
        ListNode later = curr.next;
        
        //reverse between left and right
        for(int i=0;curr!=null && i<right-left+1;i++){    
            curr.next = prev;
            prev = curr;
            curr = later;
            if(later!=null){
                later = later.next;
            }
        }
        
        if(last!=null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        
        newEnd.next = curr;
        
        return head;
    }
}*/


class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if(left==right)
            return head;
        
        while(left<right)
        {
            ListNode left_val=getnode(left,head);
            ListNode right_val=getnode(right,head);
            
            int temp=left_val.val;
            left_val.val=right_val.val;
            right_val.val=temp;
                
            left++;
            right--;
            
        }
        return head;
        
    }
    
    
    public ListNode getnode(int n, ListNode head)
    {
        ListNode itr=head;
       for(int i=0;i<n-1;i++)
       {
           itr=itr.next;
       }
        return itr;
    }
}