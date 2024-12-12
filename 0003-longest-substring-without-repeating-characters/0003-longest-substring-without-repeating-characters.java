class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] freq = new int[128];
        int count=0;
        int si=0;
        int ei=0;
        int ans=0;
        while(ei<n){
            int ch = s.charAt(ei);
            if(freq[ch]!=0){
                count++;
            }
            freq[ch]++;
            ei++;
            // System.out.println(ch);
            while(count>0){
                if(freq[s.charAt(si)]>1){
                    count--;
                }
                freq[s.charAt(si)]--;
                si++;
            }
            ans = Math.max(ans, (ei-si));
        }
        return ans;
    }
}