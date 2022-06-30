class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        if(nums.length%2==1)
        {
            int mid=nums.length/2;
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                sum+=Math.abs(nums[mid]-nums[i]);
            }
            return sum;
        }
        else
        {
            int mid1=nums.length/2;
             int sum1=0;
            for(int i=0;i<nums.length;i++)
            {
                sum1+=Math.abs(nums[mid1]-nums[i]);
            }
             int mid2=(nums.length/2)-1;
             int sum2=0;
            for(int i=0;i<nums.length;i++)
            {
                sum2+=Math.abs(nums[mid2]-nums[i]);
            }
            
            if(sum1>sum2)
                 return sum2;
            else
                return sum1;
        }
        //return 0;
    }
}