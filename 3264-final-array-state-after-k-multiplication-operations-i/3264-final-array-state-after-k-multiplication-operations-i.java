class Solution {
    class Pair{
        int idx;
        int val;
        public Pair(int idx, int val){
            this.idx = idx;
            this.val = val;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2)->{
            int val = p1.val-p2.val;
            if(val==0){
                return p1.idx-p2.idx;
            }
            return val;
        });
        for(int i=0;i<nums.length;i++){
            pq.add(new Pair(i, nums[i]));
            // System.out.println(i+","+nums[i]);
        }
        
        while(k-->0){
            Pair p = pq.remove();
            int index = p.idx;
            int value = p.val;
            nums[index] = multiplier*value;
            pq.add(new Pair(index, nums[index]));
        }
        return nums;
            
    }
}