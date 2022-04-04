class Solution {
    int par[];
    int size[];
    
    public int findpar(int u)
    {
        if(par[u]==u)
            return u;
        
        int np=par[u];
        int v=findpar(np);
        par[u]=v;
        return v;
    }
    
    public void merge(int p1, int p2)
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
    
    
    public int findCircleNum(int[][] isConnected) {
        
        
        
        
        int n=isConnected.length;
        par=new int[n];
        size=new int[n];
        
        for(int i=0;i<n;i++)
        {
            par[i]=i;
            size[i]=1;
        }
        int count=n;
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<isConnected[0].length;j++)
           {
               if(isConnected[i][j]==1)
               {
                   int u=i;
                   int v=j;
                   int p1=findpar(u);
                   int p2=findpar(v);
                   if(p1!=p2)
                   {
                       merge(p1,p2);
                       count--;
                       //System.out.println("abc");
                   }
                       
               }
           }
        }
        return count;
        
    }
}