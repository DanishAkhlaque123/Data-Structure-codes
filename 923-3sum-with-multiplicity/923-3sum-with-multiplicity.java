class Solution {
    public int threeSumMulti(int[] arr, int target) {
        HashMap<Integer,Long> hm=new HashMap<>();
        for(int ele:arr)
        {
            if(hm.containsKey(ele))
            {
                hm.put(ele,hm.get(ele)+1);
            }
            else
            {
                hm.put(ele,1l);
            }
        }
        
        
        long ans=0;
        
        for(int ele1:hm.keySet())
        {
            for(int ele2:hm.keySet())
            {
                int ele3=target-ele1-ele2;
                if(hm.containsKey(ele3))
                {
                    long fre1=hm.get(ele1);
                    long fre2=hm.get(ele2);
                    long fre3=hm.get(ele3);
                    
                    if(ele1==ele2 && ele2==ele3)
                    {
                        ans+=((fre1)*(fre1-1)*(fre1-2))/6;
                    }
                    else if(ele1==ele2 && ele1!=ele3)
                    {
                        ans+=(fre1*(fre1-1)/2)*fre3;
                    }
                    else if(ele1>ele2 && ele2>ele3)
                    {
                        ans+=(fre1*fre2*fre3);
                    }
                }
                ans=ans % 1000000007;
            }
        }
        
        return (int)ans;
        
    }
}