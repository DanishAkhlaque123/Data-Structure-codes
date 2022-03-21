class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        if(n==1)
            return true;
        
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(nums[0]);
        int temp=0;
        for(int i=1;i<n;i++)
        {
           if(al.get(temp)!=nums[i])
           {
               al.add(nums[i]);
               temp++;
           }
        }
        if(al.size()==1)
            return true;
        
        if(al.get(0)>al.get(1))
        {
           for(int i=0;i<al.size()-1;i++)
            {
                if(al.get(i)<al.get(i+1))
                    return false;
            } 
        }
          if(al.get(0)<al.get(1))
        {
           for(int i=0;i<al.size()-1;i++)
            {
                if(al.get(i)>al.get(i+1))
                    return false;
            } 
        }
        
        
        //System.out.println(al);
        return true;
    }
}