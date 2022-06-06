class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> al=new ArrayList<List<Integer>>();
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++)
        {
            List<Integer> sub=new ArrayList<>();
            for(int j=0;j<i;j++)
            {
                if(j==0 || j==i-1)
                {
                    sub.add(1);
                    
                }
                else
                {
                    sub.add(al.get(i-2).get(j-1)+al.get(i-2).get(j));
                    
                }
            }
            al.add(sub);
            ans=sub;
        }
        return ans;
    }
}