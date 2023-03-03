class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int m=haystack.length();
        if(m<n)
            return -1;
        
        if(n==1 && m==1 && haystack.equals(needle)){
            return 0;
        }
        
        for(int i=0;i<m-n+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=i+n;
                String stringToBeMatched="";
                if(j==m){
                    stringToBeMatched=haystack.substring(i);
                    System.out.println(stringToBeMatched);
                }
                else
                {
                    stringToBeMatched=haystack.substring(i,j);
                    System.out.println(stringToBeMatched);
                }
                
                if(stringToBeMatched.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}