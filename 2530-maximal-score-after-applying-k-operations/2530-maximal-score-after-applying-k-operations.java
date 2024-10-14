class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for(int val : nums){
            pq.add(val);
        }
        long ans=0;
        while(k-->0){
            int val = pq.remove();
            ans+=val;
            pq.add((int)Math.ceil((double)val/3));
        }
        return ans;
    }
}