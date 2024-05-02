class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> posNegNum = new HashSet<>();
        for(int val : nums){
            posNegNum.add(val);
        }
        
        int ans = -1;
        Iterator<Integer> ai = posNegNum.iterator();
        while(ai.hasNext()){
            int nextEle = ai.next();
            if(nextEle>ans && posNegNum.contains(nextEle*(-1))){
                ans = nextEle;
                // System.out.println(nextEle);
            }
        }
        return ans;
    }
}