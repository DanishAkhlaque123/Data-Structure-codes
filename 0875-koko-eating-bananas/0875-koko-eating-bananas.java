class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=0;
        int max=Integer.MIN_VALUE;
        for(int e:piles){
            max=Math.max(max,e);
        }
        while(min<=max){
            int mid=(min+max)/2;
            if(mid!=0 && isTrue(piles,h,mid)){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
    
    public boolean isTrue(int[] piles, int h, int mid){
        int total=0;
        for(int e : piles){
            int time=e/mid;
            if(e%mid!=0){
                time++;
            }
            total+=time;
        }
        return total<=h;
    }
    
    
}