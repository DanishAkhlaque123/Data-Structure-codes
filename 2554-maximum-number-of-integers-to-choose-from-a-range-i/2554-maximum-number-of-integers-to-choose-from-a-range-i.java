class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> hs = new HashSet<>();
        for(int val : banned){
            hs.add(val);
        }
        
        int count=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(!hs.contains(i) && sum+i<=maxSum){
                sum+=i;
                count++;
            }
        }
        return count;
    }
}