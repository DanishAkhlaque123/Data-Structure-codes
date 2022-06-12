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
        LinkedList<Node> ll=new LinkedList<>();
        ll.addLast(root);
        while(ll.size()>0)
        {
            int size=ll.size();
            int count=size;
            int count1=0;
            while(size-->0)
            {
                count1++;
                Node t=ll.removeFirst();
                if(t.left!=null)
                    ll.add(t.left);
                if(t.right!=null)
                    ll.add(t.right);
                if(count1!=count)
                t.next=ll.peek();
                
            }
        }
        return root;
    }
}