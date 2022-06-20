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
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().zigZag(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution {
    void zigZag(int arr[], int n) {
        // code here
       // int n=arr.length;
        for(int i=1;i<n;i=i+2)
        {
            if(arr[i-1]>arr[i])
            {
                swap(arr,i-1,i);
            }
            
            if(i+1<n && arr[i]<arr[i+1])
            {
                swap(arr,i,i+1);
            }
            
            
        }
    }
    
    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}