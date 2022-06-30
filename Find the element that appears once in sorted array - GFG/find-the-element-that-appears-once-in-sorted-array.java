// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int findOnce(int a[], int n)
    {
        if(n==1)
        return a[0];
        if(a[n-1]!=a[n-2])
        return a[n-1];
        // Complete this function
        for(int i=0;i<n-1;i=i+2)
        {
            if(a[i]!=a[i+1])
            return a[i];
        }
        return 0;
    }
}