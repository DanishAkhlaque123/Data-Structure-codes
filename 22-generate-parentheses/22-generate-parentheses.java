class Solution {
    List<String> al=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
         generate(n,0,0,"");
        return al;
    }
    
    public void generate(int n,int open, int close, String s)
    {
        if(open==n && close==n)
        {
            al.add(s);
           // return al;
        }
        
        if(open<n)
        {
           generate(n,open+1,close,s+"(");
        }
         if(close<open)
        {
            generate(n,open,close+1,s+")");
        }
       
        
    }
}