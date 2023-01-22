class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s,new ArrayList<>(),"");
        return ans;
    }
    
    public void helper(String s, List<String> res, String sol){
        // if(idx==s.length())
        // {
        //     System.out.println("I am in base condition");
        //     if(res.size()>0){
        //         ans.add(res);
        //     }
        //     System.out.println(res);
        //     return;
        // }
        // for(int i=1;i+idx<=s.length();i++){
        //     if(isPalindrome(s,idx,idx+i-1)){
        //         res.add(s.substring(idx,idx+i));    
        //     }
        //     helper(s,idx+i,res);   
        // }
        if(s.length()==0){
            
            
            
            String toSplit=sol.substring(0,sol.length()-1);
            String[] splittedArray=toSplit.split("[.]");
            ans.add(Arrays.asList(splittedArray));
            return;
        }
        
        for(int i=0;i<s.length();i++){
            String newSubstring=s.substring(0,i+1);
            String restString=s.substring(i+1);
            if(isPalindrome(newSubstring,0,newSubstring.length()-1)){
                helper(restString,res,sol+newSubstring+".");
            }
        }
        
    }
    public boolean isPalindrome(String str, int si, int ei){
        while(si<=ei){
            if(str.charAt(si)!=str.charAt(ei)){
                return false;
            }else
            {
                si++;
                ei--;
            }
        }
        return true;
    }
}