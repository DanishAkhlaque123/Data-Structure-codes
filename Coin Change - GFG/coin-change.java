// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Arr[] = new int[m];
            for (int i = 0; i < m; i++) Arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(Arr, m, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int S[], int m, int n) {
        // code here.
        long ans=helper(S,0,n);
        return ans;
    }
    
    public long helper(int[] s,int idx, int sum)
    {
        long[] dp=new long[sum+1];
        int n=s.length;
        dp[0]=1;
        
        for(int coin:s)
        {
            for(int i=coin;i<=sum;i++)
            {
                dp[i]+=dp[i-coin];
            }
        }
        
        return dp[sum];
    }
    
}