// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        
        //while testcases exist
        while(t-->0){
            
            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);
            
            ArrayList<Integer> arr = new ArrayList<>();            
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr.add(Integer.parseInt(inputLine2[i]));
            }
            
            Solution obj = new Solution();
            obj.reverseInGroups(arr, n, k);
            
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int i;
        int i1=0;
        for( i=0;i<arr.size();i=i+k)
        {
            int t=k-1+i;
             i1=i;
            while(i1<t && t<arr.size())
            {
                int temp=arr.get(i1);
                arr.set(i1,arr.get(t));
                arr.set(t,temp);
                
                i1++;
                t--;
                
            }
          //  System.out.println(i1);
        }
        int t1=arr.size()-1;
        while(i1<t1)
        {
            int temp=arr.get(i1);
                arr.set(i1,arr.get(t1));
                arr.set(t1,temp);
                
                i1++;
                t1--;
        }
        
        
        
      
        
    }
}
