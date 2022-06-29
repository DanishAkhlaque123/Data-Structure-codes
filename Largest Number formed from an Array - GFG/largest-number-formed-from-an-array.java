// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] s) {
        // code here
       // String[] s=new String[arr.length];
        
       
        
        Arrays.sort(s,(a,b)->{
           double n1=Double.parseDouble(a+b);
           double n2=Double.parseDouble(b+a);
           
           if(n1>n2)
           {
               return 1;
               
           }
           else if(n1<n2)
           {
               return -1;
           }
           else
           {
               return 0;
           }
           
        });
        
        StringBuilder sb=new StringBuilder();
        for(int i=s.length-1;i>=0;i--)
        {
            sb.append(s[i]);
            
        }
        return sb.toString();
        
        
    }
}