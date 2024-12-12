class Solution {
    public long pickGifts(int[] gifts, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : gifts){
            pq.add(val);
        }
        long ans=0;
        while(k>0){
            int val = pq.remove();
            int sqrt = (int)Math.floor((double)Math.sqrt(val));
            // System.out.println(sqrt);
            pq.add(sqrt);
            k--;
        }
        // System.out.println(pq);
        while(pq.size()>0){
            ans+=pq.remove();
        }
        return ans;
    }
}