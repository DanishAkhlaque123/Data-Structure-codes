class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
       Arrays.sort(nums);
        int count=nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int val : nums){
            if(hm.containsKey(val)){
                hm.put(val, hm.get(val)+1);
            }
            else{
                hm.put(val, 1);
            }
        }
        for(int i=0; i<nums.length;i++){
            int val = nums[i];
            if(!hm.containsKey(val)){
                continue;
            }
            int size = k;
            while(size>0){
                if(hm.containsKey(val)){
                    size--;
                    hm.put(val, hm.get(val)-1);
                }
                else{
                    return false;
                }
                if(hm.get(val)==0){
                    hm.remove(val);
                }
                val++;
            }
        }
        if(hm.size()>0){
            return false;
        }
        
        return true; 
    }
}