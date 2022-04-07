class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)
        {
            return stones[0];
        }
        
        
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
        
        while(pq.size()>1)
        {
            int st1=pq.remove();
            int st2=pq.remove();
            if(st1==st2)
                continue;
            else if(st1!=st2)
            {
                pq.add(st1-st2);
            }
        }
        if(pq.size()==2)
        {
            int st3=pq.remove();
            int st4=pq.remove();
            if(st3==st4)
            {
                return 0;
            }
        }
        if(pq.size()==0)
            return 0;
        return pq.remove();
    
        
        
    }
}