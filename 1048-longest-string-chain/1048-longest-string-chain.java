class Solution {
    public int longestStrChain(String[] words) {
         Arrays.sort(words,(a,b)->a.length()-b.length());
    int[]dp = new int[words.length];
    Arrays.fill(dp,1);
    
    for(int i = words.length-1; i>=0; i--){
        for(int j = i+1; j<words.length;j++){
            if(words[i].length() + 1 == words[j].length() && (check(words[i],words[j])))
                dp[i] = Math.max(dp[i],dp[j]+1);
        }
    }
    
    int mx = 0;
    for(int i : dp)
        mx = Math.max(mx,i);
    return mx;
    }
    
    
    public boolean check(String s1, String s2){
    int a = 0, b = 0;
    while(a < s1.length() && s1.charAt(a) == s2.charAt(b)){
        a++;
        b++;
    }
    if(a == s1.length() || s2.substring(b+1).equals(s1.substring(a)))
        return true;
    return false;
}
}