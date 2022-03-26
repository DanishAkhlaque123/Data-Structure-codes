class Solution {
     int[] par;
    int[] size;
       
    public int findpar(int u)
    {
        if(par[u]==u)
            return u;
        int p=findpar(par[u]);
        par[u]=p;
        return p;
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
 
    
    public int makeConnected(int n, int[][] edges) {
        if(edges.length<n-1)
            return -1;
        
        
        par=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++)
        {
            par[i]=i;
            size[i]=1;
        }
        
        for(int[] edge:edges)
        {
            int u=edge[0];
            int v=edge[1];
            int p1=findpar(u);
            int p2=findpar(v);
           
             if(p1!=p2)
            {
                merge(p1,p2);
                //addEdge(graph,u,v);
            }
        }
        int t=0;
        for(int i=0;i<par.length;i++)
        {
            if(par[i]==i)
                t++;
        }
        
       return t-1;
    
  

    }
}
