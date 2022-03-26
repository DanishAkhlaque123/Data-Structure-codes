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
  //  int ans[]=new int[2];
    public int[] findRedundantConnection(int[][] edges) {
       // ArrayList<Integer>[] graph=new ArrayList[edges.length];
        par=new int[edges.length];
        size=new int[edges.length];
        for(int i=0;i<edges.length;i++)
        {
            par[i]=i;
            size[i]=1;
        }
        
        for(int[] edge:edges)
        {
            int u=edge[0]-1;
            int v=edge[1]-1;
            int p1=findpar(u);
            int p2=findpar(v);
            if(p1==p2)
            {
                return edge;
                
            }
            else if(p1!=p2)
            {
                merge(p1,p2);
                //addEdge(graph,u,v);
            }
        }
        
       return new int[]{};
    }
    
  
}