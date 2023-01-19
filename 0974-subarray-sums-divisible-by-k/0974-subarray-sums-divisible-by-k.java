class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int csum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int ans=0;
        for(int i=0;i<nums.length;i++){
             csum+=nums[i];
            int toFind=csum%k;
            if(toFind<0)
                toFind+=k;
            if(hm.containsKey(toFind)){
                ans+=hm.get(toFind);
                hm.put(toFind,hm.get(toFind)+1);
            }
            else{
                hm.put(toFind,1);
            }
        }
        return ans;
    }
}