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
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        
        Arrays.sort(Intervals,(int[] a,int[] b)->{
            return a[0]-b[0];
        });
        
        Stack<int[]> st=new Stack<>();
        st.push(Intervals[0]);
        for(int i=1;i<Intervals.length;i++)
        {
            int si=Intervals[i][0];
            int ei=Intervals[i][1];
            int[] rem=st.peek();
            if(rem[1]>=si)
            {
                int[] rem1=st.pop();
                rem1[1]=Math.max(ei,rem1[1]);
                st.push(rem1);
            }
            else
            {
               int[] ins=new int[2];
               ins[0]=si;
               ins[1]=ei;
               st.push(ins);
            }
            
        }
        int[][] result=new int[st.size()][2];
        int j=st.size()-1;
        while(st.size()>0)
        {
            int[] ans=st.pop();
            result[j][0]=ans[0];
            result[j][1]=ans[1];
            j--;
            
        }
        return result;
        
    }
}