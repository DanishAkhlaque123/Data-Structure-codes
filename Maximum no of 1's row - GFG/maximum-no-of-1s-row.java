// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int ans=Integer.MAX_VALUE;
        int idx=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            int[] to_search=Mat[i];
          int ans1=bs(to_search,0,M-1,0);
            if(ans1<ans)
            {
                idx=i;
                ans=ans1;
            }
                
           
        }
        return idx;
    }
    
    
    public static int bs(int[] to_search,int si, int ei,int key)
    {
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(to_search[mid]==key)
            {
                si=mid+1;
            }
            
            if(to_search[mid]>key)
            {
                ei=mid-1;
            }
            
           
        }
        return si-1;
    }
}