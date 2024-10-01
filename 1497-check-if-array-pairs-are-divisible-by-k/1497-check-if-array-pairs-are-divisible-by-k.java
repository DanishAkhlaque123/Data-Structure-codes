class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n=arr.length;
        int[] ans= new int[k];
        for(int i=0;i<n;i++){
            if(arr[i]%k<0){
                ans[(arr[i])%k+k]++;
            }else{
                ans[arr[i]%k]++;
            }
        }
        
        
        for(int i=0;i<=k/2;i++){
            if(i==0 && ans[i]%2!=0){
                return false;
            }
            
            if(i!=0 && ans[i]!=ans[k-i]){
                return false;
            }
            
        }
        return true;
    }
}