class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        if(n<=1)
        {
            int[] a = new int[1];
                a[0]=1;
            return a;
        }
            
        int[] ans=new int[k];
       // int[] abc=new int[Integer.MAX_VALUE];
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            int ele=nums[i];
            if(hm.containsKey(ele))
            {
                hm.put(ele,hm.get(ele)+1);
            }
            else
            {
                hm.put(ele,1);
            }
        }
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((int[] a,int[] b)->
                                                    {
                                                   return a[1]-b[1];
                                                        }  );
        
        for(int key:hm.keySet())
        {
            pq.add(new int[]{key,hm.get(key)});
            if(pq.size()>k)
                pq.remove();
        }
        int index = 0;
        while (!pq.isEmpty()) {
            ans[index++] = pq.remove()[0];
        }
        return ans;
        
        
        
    }
}