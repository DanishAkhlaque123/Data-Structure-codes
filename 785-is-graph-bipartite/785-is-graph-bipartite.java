class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] vis=new int[graph.length];
        Arrays.fill(vis,-1);
        for(int i=0;i<vis.length;i++)
        {
            if(vis[i]==-1)
            {
                boolean possible=bfs(i,vis,graph);
                if(possible==false)
                    return false;
            }
        }
        return true;
    }
    
    public boolean bfs(int src,int[] vis,int[][] graph)
    {
        LinkedList<Integer> que=new LinkedList<>();
        que.add(src);
        int colour=0;
        vis[src]=0;
        while(que.size()>0)
        {
            int size=que.size();
            while(size-->0)
            {
                int t=que.removeFirst();
                if(vis[t]!=-1)
                {
                    if(vis[t]!=colour)
                    {
                        return false;
                    }
                }
                vis[t]=colour;
                for(int v:graph[t])
                {
                    if(vis[v]==-1)
                    {
                        que.addLast(v);
                    }
                }
            }
            colour=(colour+1)%2;
            
        }
        return true;
    }
    
}