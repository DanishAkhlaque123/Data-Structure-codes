class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> hm =new HashMap<>();
        int ans=0;
        int sum = 0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int val = sum%k;
            // System.out.println(val);
            if(val<0){
                val+=k;
            }
            if(hm.containsKey(val)){
                ans += hm.get(val);
                hm.put(val, hm.get(val)+1);
                // System.out.println(val+"->"+ ans);
            }
            else{
                hm.put(val, 1);
            }
        }
        System.out.println(hm);
        return ans;
    }
}