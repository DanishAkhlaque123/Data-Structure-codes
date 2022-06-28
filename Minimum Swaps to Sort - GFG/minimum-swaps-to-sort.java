// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int n=nums.length;
        pair[] res=new pair[n];
        for(int i=0;i<n;i++)
        {
            res[i]=new pair(nums[i],i);
            
        }
        
        Arrays.sort(res,(pair a,pair b)->{
            return a.val-b.val;
        });
        int ans=0;
        boolean[] vis=new boolean[n];
        
        for(int i=0;i<n;i++)
        {
            if(vis[i]==true || res[i].idx==i)
            continue;
            
            int j=i;
            int count=0;
            while(vis[j]==false)
            {
                count++;
                vis[j]=true;
                j=res[j].idx;
            }
            
            ans+=count-1;
        }
        return ans;
        
    }
    
     public class pair {
        int val;
        int idx;
         public pair(int val,int idx)
        {
            this.val=val;
            this.idx=idx;
        }
        
       

     }
}
    