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
    ListNode curr;
    int count=0;
    List<Integer> arr=new ArrayList<>();

    public Solution(ListNode head) {
        this.curr=head;
        while(curr!=null){
            count+=1;
            arr.add(curr.val);
            curr=curr.next;
        }
    }
    
    public int getRandom() {
        Random rand=new Random();
        int value = rand.nextInt(this.count);
        return this.arr.get(value);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */