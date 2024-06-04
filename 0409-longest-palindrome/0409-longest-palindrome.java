class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        if(hm.size()==1){
            return hm.get(s.charAt(0));
        }
        int ans=0;
        int oddLen=0;
        for(char charac : hm.keySet()){
            // System.out.println(charac+"-"+hm.get(charac));
            if(hm.get(charac)%2==1){
                oddLen = Math.max(hm.get(charac), oddLen);
                ans+=hm.get(charac)-1;
            }
            else if(hm.get(charac)%2==0){
                ans+=hm.get(charac);
            }
        }
        if(oddLen!=0){
           ans+=1; 
        }
        return ans;
        
    }
}