class Solution {
    
    public boolean isqueensafe(String[][] chess, int row, int col)
    {
        int n=chess.length;
        int[][] dirs={{-1,0},{-1,-1},{1,0},{0,-1},{0,1},{1,-1},{1,1},{-1,1}};
        for(int dis=1;dis<=n;dis++)
        {
            for(int i=0;i<8;i++)
            {
                int rmov=dirs[i][0];
                int cmov=dirs[i][1];
                
                int nrow=row+rmov*dis;
                int ncol=col+cmov*dis;
                
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<n)
                {
                    if(chess[nrow][ncol]=="Q")
                        return false;
                }
                
            }
        }
        return true;
    }
    
    public void solve(String[][] chess,int idx,List<List<String>> finallist)
    {
        if(idx==chess.length)
        {
           List<String> list=new ArrayList<>();
            for(int i=0;i<chess.length;i++)
            {
                String s="";
                for(int j=0;j<chess.length;j++)
                {
                    s+=chess[i][j];
                }
                list.add(s);
            }
            finallist.add(list);
                
               
        }
        
        for(int col=0;col<chess.length;col++)
        {
            if(isqueensafe(chess,idx,col))
            {
                chess[idx][col]="Q";
                solve(chess,idx+1,finallist);
                chess[idx][col]=".";
            }
        }
        
    }
    
    public List<List<String>> solveNQueens(int n) {
        String[][] chess=new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                chess[i][j]=".";
            }
        }
        List<List<String>> finallist=new ArrayList<>();
        solve(chess,0,finallist);
        return finallist;
    }
}