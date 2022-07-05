class Solution {
    int max=1;
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        int count=1;
        int j=pq.remove();
        while(pq.size()>0)
        {
            int k=pq.remove();
            if(k-j==1)
            {
                count++;
                max=Math.max(count,max);
            }
            else if(k-j==0)
            {
                continue;
            }
            else
            {
                count=1;
            }
            j=k;
            
        }
        return max;
        
        
        
    }
}