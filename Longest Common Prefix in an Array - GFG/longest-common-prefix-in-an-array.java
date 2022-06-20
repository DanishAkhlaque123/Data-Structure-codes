// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String s="";
        int i=0;
        boolean flag=true;
        for(;i<arr[0].length();i++)
        {
            char c=arr[0].charAt(i);
            for(int j=1;j<n;j++)
            {
                if(i<arr[j].length() && c==arr[j].charAt(i))
                {
                    continue;
                }
                else
                {
                    flag=false;
                }
            }
            if(!flag)
            {
                break;
            }
        }
       String  ans=arr[0].substring(0,i);
        if(ans.length()>0)
        return ans;
        return "-1";
    }
}