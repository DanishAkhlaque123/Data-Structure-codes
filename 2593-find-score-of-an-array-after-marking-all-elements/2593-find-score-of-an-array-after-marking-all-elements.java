class Solution {
    class Pair{
        int val;
        int idx;
        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public long findScore(int[] nums) {
        List<Pair> al = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            al.add(new Pair(nums[i], i));
        }
        long ans=0;
        Collections.sort(al, (p1, p2) -> p1.val - p2.val);
        for(int i=0;i<nums.length;i++){
            Pair p = al.get(i);
            int idx = p.idx;
            if(vis[idx]){
                continue;
            }
            // System.out.println(idx);
            vis[idx]=true;
            if(idx-1>=0){
                vis[idx-1]=true;
            }
            if(idx+1<nums.length){
                vis[idx+1]=true;
            }
            ans+=p.val;
        }
        return ans;
    }
}