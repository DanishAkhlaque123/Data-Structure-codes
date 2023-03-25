class Solution {
    int connected=0;
    class Edge{
        int u;
        int v;
        public Edge(int u, int v){
            this.u=u;
            this.v=v;
        }
    }
    public long countPairs(int n, int[][] edges) {
        ArrayList<Edge>[] graph =new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int[] edge : edges){
            int u=edge[0];
            int v=edge[1];
            addEdge(u,v,graph);
        }
        long count=0;
        int[] visited=new int[n];
        Arrays.fill(visited, -1);
        long notConnected=0;
        for(int i=0;i<n;i++){
            
                dfs(i,graph,visited);
                notConnected=n-connected;
                //System.out.println(connected);
                count+=connected * notConnected;
            
            connected=0;
        }
        return count/2;
        
    }
    
    public void addEdge(int u, int v, ArrayList<Edge>[] graph){
        graph[u].add(new Edge(u,v));
        graph[v].add(new Edge(v,u));
    }
    
    public void dfs(int src, ArrayList<Edge>[] graph, int[] vis){
        if(vis[src]!=-1){
            return;
        }
        vis[src]=1;
        connected++;
        
        for(Edge childs : graph[src]){
            int u=childs.u;
            int v=childs.v;
            if(vis[v]==-1)
                dfs(v, graph, vis);
        }
        
    }
}