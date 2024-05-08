class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> valInd = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            int val = score[i];
            valInd.put(val, i);
            pq.add(val);
        }
        
        String[] ans = new String[score.length];
        int count=0;
        while(pq.size()>0){
            int val1 = pq.remove();
            int idx = valInd.get(val1);
            if(count==0){
                ans[idx]="Gold Medal";
                count++;
            }
            else if(count==1){
                ans[idx]="Silver Medal";
                count++;
            }
            else if(count==2){
                ans[idx]="Bronze Medal";
                count++;
            }
            else{
                ans[idx]=count+1+"";
                count++;
            }
        }
        return ans;
    }
}