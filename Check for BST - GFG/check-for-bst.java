// { Driver Code Starts
//Initial Template for Java
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution g = new Solution();
        	    if(g.isBST(root))
			        System.out.println(1);
			    else
			        System.out.println(0);
                t--;
            
        }
    }
  
}


// } Driver Code Ends


//User function Template for Java


public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    public class bstPair{
        boolean isbst;
        int max;
        int min;
        public bstPair(boolean isbst,int max,int min)
        {
            this.isbst=isbst;
            this.max=max;
            this.min=min;
            
        }
    }
    
    
    boolean isBST(Node root)
    {
        // code here.
      bstPair res=helper(root);
      return res.isbst;
       
    }
    
    
    public bstPair helper(Node root)
    {
         if(root==null)
       {
           bstPair bp=new bstPair(true,Integer.MIN_VALUE,Integer.MAX_VALUE);
           return bp;
       }
       
       bstPair lp=helper(root.left);
       bstPair rp=helper(root.right);
       
       if(lp.isbst==true && rp.isbst==true && lp.max<root.data && rp.min>root.data)
       {
           int max=Math.max(root.data,rp.max);
           int min=Math.min(root.data,lp.min);
           bstPair ans=new bstPair(true,max,min);
           return ans;
       }
       else
       {
           bstPair ans=new bstPair(false,22,33);
           return ans;
       }
    }
    
    
}