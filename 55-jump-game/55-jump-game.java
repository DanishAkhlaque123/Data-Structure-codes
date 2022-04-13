class Solution {
    public boolean canJump(int[] nums) {
        
        int n=nums.length;
        if(n==1)
            return true;
        boolean[] ans=new boolean[n];
       
        ans[n-1]=true;
        
        
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<=nums[i] && i+j<ans.length;j++)
            {
                if(ans[i+j]==true)
                {
                    ans[i]=true;
                    break;
                }
            }
        }
        
        
        return ans[0];
    }
}
