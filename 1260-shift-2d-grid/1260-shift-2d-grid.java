class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int arr_length=n*m;
        if(k>arr_length)
            k=k%arr_length;
        if(arr_length==1)
        {
            List<List<Integer>> ans=new ArrayList<>();
            List<Integer> smallans=new ArrayList<>();
            smallans.add(grid[0][0]);
            ans.add(smallans);
            return ans;
        }
        int[] a=new int[arr_length];
            int k1=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[k1]=grid[i][j];
                k1++;
            }
        }
        
        reverse(a,0,a.length-k-1);
        reverse(a,a.length-k,a.length-1);
        reverse(a,0,a.length-1);
        
       
        
        
       List<List<Integer>> al=new ArrayList<>();
        
        for(int i=0;i<a.length;i+=m)
        {
            
            al.add(new ArrayList<>());
         
        }
        //System.out.println(al.size());
        
        int k2=0;
        for(int i=0;i<al.size();i++)
        {
            for(int j=0;j<m;j++)
            {
                al.get(i).add(a[k2]);
                k2++;
            }
            
        }
        
        return al;
       
    }
    
    public void reverse(int[] a,int i,int j)
    {
        while(i<=j)
        {
            swap(a,i,j);
            i++;
            j--;
        }
    }
    
    public void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}