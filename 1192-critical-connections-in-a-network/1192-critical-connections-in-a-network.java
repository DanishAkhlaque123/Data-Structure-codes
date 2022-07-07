class Solution {
    int[] parent;
    int[] disc;
    int[] low;
    int time;
    boolean[] vis;
    boolean[] ap;
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<connections.size();i++)
        {
            int u=connections.get(i).get(0);
            int v=connections.get(i).get(1);
            
            graph.get(u).add(v);
            graph.get(v).add(u);
            
        }
        
        parent=new int[n];
        disc=new int[n];
        low=new int[n];
        time=0;
        vis=new boolean[n];
        ap=new boolean[n];
        parent[0]=-1;
        
        dfs(0,graph);
        return ans;
        
        
    }
    
    public void dfs(int u,ArrayList<ArrayList<Integer>> graph)
    {
        disc[u]=low[u]=time;
        time++;
        vis[u]=true;
        for(int i=0;i<graph.get(u).size();i++)
        {
            int v=graph.get(u).get(i);
            if(parent[u]==v)
                continue;
            else if(vis[v]==true)
                low[u]=Math.min(low[u],disc[v]);
            else
            {
                parent[v]=u;
                dfs(v,graph);
                low[u]=Math.min(low[u],low[v]);
                
            }
            if(low[v]>disc[u])
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(u);
                temp.add(v);
                ans.add(temp);
            }
        }
    }
    
}