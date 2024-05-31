class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> ans  = new HashMap<>();
        int[] sol = new int[2];
        for(int i : nums){
            if(ans.containsKey(i)){
                ans.put(i, ans.get(i)+1);
            }
            else{
                ans.put(i, 1);
            }
        }
        int count=0;
        for(int val : ans.keySet()){
            if(ans.get(val)==1){
                sol[count]=val;
                count++;
            }
        }
        return sol;
    }
}