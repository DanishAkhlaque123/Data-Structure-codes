class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i!=0 && sum%k==0){
                    return true;
                }
            if(!hm.containsKey(sum%k)){
                hm.put(sum%k, i);
            }
            else if(hm.containsKey(sum%k)){
                if(i-hm.get(sum%k)>=2){
                    return true;
                }
            }
        }
        return false;
    }
}