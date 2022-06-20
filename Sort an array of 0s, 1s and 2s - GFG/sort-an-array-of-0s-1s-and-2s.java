// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
      int p1=-1;
      int p2=0;
      int p3=a.length-1;
      while(p2<=p3)
      {
          if(a[p2]==2)
          {
             swap(a,p2,p3);
             p3--;
          }
         else if(a[p2]==0)
          {
              p1++;
              swap(a,p2,p1);
              p2++;
          }
          else
          {
              p2++;
          }
      }
        
        
    }
    
    public static void swap(int[] a, int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends