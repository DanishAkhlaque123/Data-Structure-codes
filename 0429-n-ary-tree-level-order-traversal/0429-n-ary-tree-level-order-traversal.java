/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        LinkedList<Node> queue=new LinkedList<>();
        List<Integer> first=new ArrayList<>();
        first.add(root.val);
        ans.add(first);
        queue.add(root);
        while(queue.size()>0)
        {
            ArrayList<Integer> Add=new ArrayList<>();
            int size=queue.size();
            while(size-->0)
            {
                Node t=queue.removeFirst();
                for(Node child:t.children)
                {
                    Add.add(child.val);
                    queue.add(child);
                }
            }
            if(Add.size()>0)
            ans.add(Add);
        }
        return ans;
        
    }
}