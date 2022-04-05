class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int[][] dis=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dis[i][j]=(int)(1e8);
            }
        }
        
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((int[] a,int[] b)->{
            return a[2]-b[2];
        });
        
        int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
        pq.add(new int[]{0,0,0});
        dis[0][0]=0;
        
        while(pq.size()>0)
        {
            int[] p=pq.remove();
            int i=p[0];
            int j=p[1];
            int wsf=p[2];
            if(dis[i][j]<wsf)
                continue;
            
            for(int[] dir:dirs)
            {
                int x=i+dir[0];
                int y=j+dir[1];
                
                if(x>=0 && y>=0 && x<n && y<m)
                {
                    int diff=Math.abs(heights[i][j]-heights[x][y]);
                    int finaleffort=Math.max(diff,wsf);
                    if(finaleffort<dis[x][y])
                    {
                        dis[x][y]=finaleffort;
                        pq.add(new int[]{x,y,finaleffort});
                    }
                }
            }
        }
        return dis[n-1][m-1];
        
    }
}