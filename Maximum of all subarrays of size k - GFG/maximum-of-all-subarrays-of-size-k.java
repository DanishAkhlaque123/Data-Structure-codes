// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    
    
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        
      /*  ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        while(i+k<=n)
        {
            for(int j=i;j<i+k;j++)
            {
                pq.add(arr[j]);
            }
            for(int j=0;j<k-1;j++)
            {
                pq.remove();
            }
            ans.add(pq.remove());
            i++;
        }
        return ans;*/
        // Your code here
       ArrayList<Integer> ans=new ArrayList<>();
        int[] ngr=new int[n]; //next greatest right
        ngr[n-1]=n;
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            int ele=arr[i];
            while(st.size()>0 && ele>=arr[st.peek()])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                ngr[i]=n;
               
                
            }
            else
            {
                ngr[i]=st.peek();
            }
            
            st.push(i);
           
            
        }
     
        int[] ans1=new int[n-k+1];
        int idx=0;
        for(int si=0;si<n-k+1;si++)
        {
            int ei=si+k-1;
            if(idx<si)
            {
                idx=si;
            }
            
            while(ngr[idx]<=ei)
            {
                idx=ngr[idx];
            }
            ans1[si]=arr[idx];
        }
       
        
        for(int i=0;i<ans1.length;i++)
        {
            ans.add(ans1[i]);
        }

       
        return ans;
    }
}