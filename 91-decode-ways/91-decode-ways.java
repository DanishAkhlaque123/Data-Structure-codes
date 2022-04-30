class Solution {
    public int numDecodings(String s) {
        return tab(s);
    }
    
    public int tab(String str)
    {
        int n=str.length();
        int[] dp=new int[n+1];
        for(int idx=n;idx>=0;idx--)
        {
            if(idx==str.length())
            {
                dp[idx]=1;
                continue;
            }
            
            if(str.charAt(idx)=='0')
            {
                dp[idx]=0;
                continue;
            }
            int ans=dp[idx+1];
            
            if(idx+2<=str.length())
            {
                String sub=str.substring(idx,idx+2);
                if(Integer.parseInt(sub)<=26)
                {
                    ans+=dp[idx+2];
                }
            }
            dp[idx]=ans;
        }
        return dp[0];
    }
    
}