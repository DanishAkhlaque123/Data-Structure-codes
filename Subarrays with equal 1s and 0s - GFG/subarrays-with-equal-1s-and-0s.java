// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int nums[], int n)
    {
          for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }
        return maxno(nums,nums.length,0); 
        // add your code here
    }
    
    static int maxno(int Arr[],int n, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int csum=0;
        int count=0;
        map.put(csum,1);
        for(int i=0;i<n;i++)
        {
            csum+=Arr[i];
            int x=csum-k;
            if(map.containsKey(x))
            {
                count+=map.get(x);
            }
            map.put(csum,map.getOrDefault(csum,0)+1);
        }
        return count;
    }
    
    
}


