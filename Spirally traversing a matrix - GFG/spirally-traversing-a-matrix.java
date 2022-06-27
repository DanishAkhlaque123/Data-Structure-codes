// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        int rs=0;
        int cs=0;
        int re=r-1;
        int ce=c-1;
        int count=0;
        ArrayList<Integer> ans =new ArrayList<>();
        while(count<r*c)
        {
            for(int i=cs;i<=ce && count<r*c;i++)
            {
               // System.out.print(matrix[rs][i]+" ");
                ans.add(matrix[rs][i]);
                count++;
            }
            rs++;
             for(int i=rs;i<=re && count<r*c;i++)
            {
                //System.out.print(matrix[i][re]+" ");
                ans.add(matrix[i][ce]);
                count++;
            }
            ce--;
            
             for(int i=ce;i>=cs && count<r*c;i--)
            {
                //System.out.print(matrix[re][i]+" ");
                ans.add(matrix[re][i]);
                
                count++;
            }
            re--;
             for(int i=re;i>=rs && count<r*c;i--)
            {
               // System.out.print(matrix[i][cs]+" ");
                ans.add(matrix[i][cs]);
                count++;
            }
            cs++;
        }
        
        return ans;
    }
}
