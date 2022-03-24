class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] mygraph=new ArrayList[n];
        
        for(int i=0;i<n;i++)
        {
            mygraph[i]=new ArrayList<>();
        }
        
        
            for(int[] v:edges)
            {
                mygraph[v[0]].add(v[1]);
                mygraph[v[1]].add(v[0]);
            }
        
        
        
        
        boolean[] vis=new boolean[n];
        
            boolean b=dfs(n,mygraph,source,destination,vis);
            if(b)
                return true;
        
        
        return false;
        
    }
    
    
    public boolean dfs(int n, ArrayList<Integer>[] mygraph, int source, int destination,boolean[] vis)
    {
        if(source==destination)
            return true;
        vis[source]=true;
        for(int nbr:mygraph[source])
        {
            
            if(!vis[nbr])
            {
                boolean b1=dfs(n,mygraph,nbr,destination,vis);
                if(b1)
                    return true;
            }
        }
        
        return false;
    }
}