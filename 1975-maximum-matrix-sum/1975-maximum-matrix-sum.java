class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum=0;
        int zeroValue=0;
        int negativeCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zeroValue++;
                }
                if(matrix[i][j]<0){
                    negativeCount++;
                }
                pq.add(Math.abs(matrix[i][j]));
                sum+=Math.abs(matrix[i][j]);
            }
        }
        if(zeroValue>0 || negativeCount%2==0){
            return sum;
        }
        if(negativeCount%2==1){
            return sum-2*(pq.remove());
        }
        return 0;
    }
}