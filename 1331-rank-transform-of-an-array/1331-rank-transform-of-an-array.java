class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans[] = new int[arr.length];
        for(int val : arr){
            pq.add(val);
        }
        int count=1;
        HashMap<Integer, Integer> valWithIdx = new HashMap<>();
        while(pq.size()>0){
            int val = pq.remove();
            if(!valWithIdx.containsKey(val)){
               valWithIdx.put(val, count);
                count++; 
            }
            
        }
        int idx = 0;
        for(int val : arr){
            ans[idx] = valWithIdx.get(val);
            idx++;
        }
        return ans;
        
    }
}