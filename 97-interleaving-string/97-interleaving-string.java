class Solution {
    
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())
            return false;
        return rec(s1,s2,s3,0,0,0,new Boolean[s1.length()+1][s2.length()+1]);
    }
    
    public boolean rec(String s1,String s2,String s3,int i, int j, int k,Boolean[][] dp)
    {
            if(i==s1.length() && j==s2.length())
            {
                
                return true;
            }
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
            if(i< s1.length() && s1.charAt(i)==s3.charAt(k))
            {
                boolean b1=rec(s1,s2,s3,i+1,j,k+1,dp);
                dp[i][j]=b1;
                if(b1)
                    return true;
            }
        
            if(j<s2.length() && s2.charAt(j)==s3.charAt(k))
            {
               boolean b2= rec(s1,s2,s3,i,j+1,k+1,dp);
               dp[i][j]=b2;
                if(b2)
                    return true;
            }
        
        dp[i][j]=false;
        return false;
        
    }
    
}