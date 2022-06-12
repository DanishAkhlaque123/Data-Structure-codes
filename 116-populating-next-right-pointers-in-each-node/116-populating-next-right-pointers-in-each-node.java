/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return null;
        helper(root.left,root.right);
        return root; 
    }
    public void helper(Node left1, Node right1)
    {
        if(left1==null || right1==null)
            return;
        left1.next=right1;
        
        helper(left1.left,left1.right);
        helper(right1.left,right1.right);
        helper(left1.right,right1.left);
    }
    
}