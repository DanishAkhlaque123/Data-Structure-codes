class Solution {
    int[] par;
    int[] size;
    public int findpar(int u)
    {
        if(par[u]==u)
            return u;
        int np=par[u];
        int v=findpar(np);
        par[u]=v;
        return v;
        
    }
    
    
    public void merge(int p1,int p2)
    {
        if(size[p1]>=size[p2])
        {
            par[p2]=p1;
            size[p1]+=size[p2];
        }
        else
        {
            par[p1]=p2;
            size[p2]+=size[p1];
        }
    }
    
    
    public int kruskal(int[][] points1)
    {
        par=new int[points1.length+1];
        size=new int[points1.length+1];
        for(int i=0;i<par.length;i++)
        {
            par[i]=i;
            size[i]=1;
        }
        
        Arrays.sort(points1,(int[] a,int[] b)->
                    {
                     return   a[2]-b[2];
                    });
        
        int ans=0;
        for(int[] sol:points1)
        {
            int u=sol[0];
            int v=sol[1];
            int w=sol[2];
            int p1=findpar(u);
            int p2=findpar(v);
            if(p1!=p2)
            {
                merge(p1,p2);
                ans+=w;
            }
        }
        return ans;
        
        
    }
    
    public int cost(int[] a, int[] b)
    {
        return Math.abs(a[0]-b[0])+Math.abs(a[1]-b[1]);
    }
    
    
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        int k=0;
        int[][] points1=new int[(n*(n-1))/2][3];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                points1[k][0]=i;
                points1[k][1]=j;
                points1[k][2]=cost(points[i],points[j]);
                k++;
            }
        }
        
        return kruskal(points1);
    }
}