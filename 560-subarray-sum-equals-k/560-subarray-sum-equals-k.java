class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(sum,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int x=sum-k;
            if(map.containsKey(x))
                count+=map.get(x);
          
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}