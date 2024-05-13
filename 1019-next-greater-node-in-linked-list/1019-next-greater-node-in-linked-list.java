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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        int count=0;
        count = reverse(curr, prev, count);
        // System.out.println(temp.next.val);
        Stack<ListNode> st = new Stack<>();
        int[] ans = new int[count];
        if(count == 0){
            return new int[]{0};
        }
        st.push(temp);
        temp = temp.next;
        ans[count-1]=0;
        count--;
        while(temp!=null)
        {
            while(st.size()>0 && st.peek().val<=temp.val){
                st.pop();
            }
            if(st.size()>0)
                ans[--count]=st.peek().val;
            else if(st.size()==0){
                ans[--count] = 0;
            }
            // System.out.println(st.peek().val);
            st.push(temp);
            temp=temp.next;
        }
        return ans;
    }
    public int reverse(ListNode curr, ListNode prev, int count){
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
            count++;
        }
        // System.out.println(prev.val);
        return count;
    }
}