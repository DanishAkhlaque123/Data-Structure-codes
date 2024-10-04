class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int sum=skill[0]+skill[n-1];
        long ans=0;
        for(int i=0;i<n/2;i++){
            if(skill[i]+skill[n-i-1]!=sum){
                return -1;
            }
            ans+=skill[i]*skill[n-i-1];
        }
        return ans;
    }
}