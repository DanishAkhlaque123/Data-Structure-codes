class Solution {
    public boolean isSubsequence(String s, String t) {
       // int n=t.length();
       //return rec(s,t,0,n,"");
        int sn=s.length();
        int tn=t.length();
        int i1=0;
        int j1=0;
        while(i1<sn && j1<tn)
        {
            if(s.charAt(i1)==t.charAt(j1))
            {
                i1++;
                j1++;
            }
            else
            {
                j1++;
            }
        }
        if(i1==sn)
            return true;
        return false;
    }
}
 /*   public boolean rec(String s, String t,int idx,int n,String s1)
    {
        if(s.equals(s1))
        {
            return true;
        }
        
        if(idx==n)
            return false;
        
        char c=t.charAt(idx);
        boolean ans=false;
      ans =  rec(s,t,idx+1,n,s1+c+"");
        ans=ans || rec(s,t,idx+1,n,s1);
        
        return ans;
    }
    
}

 class Solution {
public boolean isSubsequence(String s, String t) {
    int i =0;
    int j =0;
    while(i<s.length() && j<t.length()){
        
        if(s.charAt(i)==t.charAt(j)){
            i++;
            j++;
        }else
            j++;
    }
    if(i==s.length()){
        return true;
    }
      return false;
   }
}*/