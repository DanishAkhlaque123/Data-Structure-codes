class Solution {
    
     public int maxlen(int[] a, int k) {
        int csum=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(csum,-1);
        for(int i=0;i<a.length;i++)
        {
            csum+=a[i];
            
            if(map.containsKey(csum))
            {
                int len=i-map.get(csum);
                ans=Math.max(ans,len);
            }
            else
            {
                map.put(csum,i);
            }
        }
        return ans;
    }
    
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }
        return maxlen(nums,nums.length); 
    }
}