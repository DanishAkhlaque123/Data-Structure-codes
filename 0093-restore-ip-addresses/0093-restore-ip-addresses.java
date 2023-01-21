class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<>();
        helper(s,0,0,"",ans);
        return ans;
    }
    
    public void helper(String s, int idx, int par, String val, List<String> ans){
        if(idx==s.length() || par==4){
            if(idx==s.length() && par==4){
                ans.add(val.substring(0,val.length()-1));
            }
            return;
        }
        helper(s,idx+1,par+1,val+s.charAt(idx)+".",ans);
        if(idx+2<=s.length() && isValid(s,idx,idx+2)){
            helper(s,idx+2,par+1,val+s.substring(idx,idx+2)+".",ans);
        }
        if(idx+3<=s.length() && isValid(s,idx,idx+3)){
            helper(s,idx+3,par+1,val+s.substring(idx,idx+3)+".",ans);
        }
    }
    
    public boolean isValid(String s,int si, int ei){
        if(s.charAt(si)=='0')
            return false;
        int val=Integer.parseInt(s.substring(si,ei));
        return val<=255;
    }
    
}