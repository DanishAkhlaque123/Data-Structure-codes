class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        if(s.equals(t) && maxCost==0){
            return s.length();
        }
        int n = s.length();
        int[] val = new int[n];
        for(int i=0;i<n;i++){
          char v1 = s.charAt(i);
            char v2 = t.charAt(i);
            val[i] = Math.abs(v1-v2);
        }
        // for(int v : val){
        //     System.out.println(v);
        // }
        if(maxCost==0){
            return 1;
        }
        int prev=0;
        int next=0;
        int ans=0;
        int count=0;
        int finalAns=0;
        while(next!=n){
            if(maxCost>=ans+val[next]){
                ans+=val[next];
                count++;
                next++;
            }
            else if(maxCost<ans+val[next]){
                count--;
                ans-=val[prev];
                prev++;
                
            }  
            finalAns=Math.max(finalAns, count);
        }
        return finalAns;
    }
}