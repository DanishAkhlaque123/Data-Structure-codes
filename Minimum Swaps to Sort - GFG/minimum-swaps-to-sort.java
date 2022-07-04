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
    class pair{
        int val;
        int idx;
        public pair(int val,int idx)
        {
            this.val=val;
            this.idx=idx;
        }
    }
    
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        pair[] ans=new pair[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=new pair(nums[i],i);
        }
        
        Arrays.sort(ans,(pair a,pair b)->{
            return a.val-b.val;
        });
        
        int ans1=0;
        boolean[] b=new boolean[nums.length];
        
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==true || ans[i].idx==i)
                continue;
                
            int count=0;
            int j=i;
            while(b[j]!=true)
            {
                count++;
                b[j]=true;
                j=ans[j].idx;
            }
            ans1+=count-1;
            
        }
        return ans1;
        
        
        
        
    }
}