/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        ListNode val = head;
        int rmin = 0;
        int rmax = m-1;
        int cmin = 0;
        int cmax = n-1;
        for(int[] anss : ans){
         Arrays.fill(anss, -1);   
        }
        while(val!=null){
            for(int i=cmin; i<=cmax && val!=null; i++){
                // System.out.print(val.val+" ");
                ans[rmin][i] = val.val;
                val = val.next;
            }
            // System.out.println();
            rmin++;
            
            for(int i=rmin; i<=rmax && val!=null; i++){
                // System.out.print(val.val+" ");
                ans[i][cmax] = val.val;
                val = val.next;
            }
            // System.out.println();
            cmax--;
            
            for(int i=cmax; i>=cmin && val!=null; i--){
                // System.out.print(val.val+" ");
                ans[rmax][i] = val.val;
                val = val.next;
            }
            // System.out.println();
            rmax--;
            
            for(int i=rmax; i>=rmin && val!=null; i--){
                // System.out.print(val.val+" ");
                ans[i][cmin] = val.val;
                val = val.next;
            }
            // System.out.println();
            cmin++;
        }
        
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(ans[i][j]);
        //     }
        //     System.out.println();
        // }
        return ans;
    }
}