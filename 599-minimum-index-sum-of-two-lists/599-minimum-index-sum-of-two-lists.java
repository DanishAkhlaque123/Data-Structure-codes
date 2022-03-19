class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<list1.length;i++)
        {
            hm.put(list1[i],i);
            
        }
        int min=10000;
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<list2.length;i++)
        {
            String s=list2[i];
            if(hm.containsKey(s))
            {
                int s1=hm.get(s);
                int sum=s1+i;
                if(sum<min)
                {
                    min=sum;
                }
            }
        }
           for(int i=0;i<list2.length;i++)
        {
            String s1=list2[i];
            if(hm.containsKey(s1))
            {
                int s11=hm.get(s1);
                int sum1=s11+i;
                if(sum1==min)
                {
                    al.add(s1);
                }
            }
        }
        return al.toArray(new String[al.size()]);
    }
}