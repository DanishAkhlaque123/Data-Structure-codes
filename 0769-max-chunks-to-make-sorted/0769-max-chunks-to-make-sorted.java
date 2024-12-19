class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr.length==1){
            return 1;
        }
        int[] max = new int[arr.length];
        int[] min = new int[arr.length];
        min[arr.length-1]=Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            max[i]=Math.max(maxVal, arr[i]);
            maxVal = max[i];
        }

        for(int j=arr.length-2;j>=0;j--){
            min[j] = Math.min(minVal, arr[j+1]);
            minVal = min[j];
        }
        for(int i=0;i<arr.length;i++){
            // System.out.println(max[i]+", "+min[i]);
            if(max[i]<=min[i]){
                ans++;
            }
        }

        return ans;
    }
}