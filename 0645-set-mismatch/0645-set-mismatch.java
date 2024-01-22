class Solution {
    public int[] findErrorNums(int[] nums) {
        int missing=0;
        int duplicate=0;
       Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // System.out.println(map);
        
        for(int i=1; i<=nums.length; i++){
            if(!map.containsKey(i)){
                missing=i;
            }
            else if(map.get(i)==2){
                duplicate = i;
            }
        }
        return new int[]{duplicate, missing};
    }
}