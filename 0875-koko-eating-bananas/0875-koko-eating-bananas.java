class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ev = (int)(1e9);
        for(int val : piles){
            ev = Math.max(val, ev);
        }
        int sv=1;
        while(sv<=ev){
            // System.out.println(sv+", "+ev);
            int mid = (sv+ev)/2;
            if(rec(piles, mid, h)){
                ev=mid-1;
            }
            else{
                sv=mid+1;
            }
        }
        return sv;
    }
    
    public boolean rec(int[] piles, int val, int h){
        int count=0;
        for(int value : piles){
            count += value/val;
            if(value%val!=0){
                count++;
            }
            if(count>h){
                return false;
            }
        }
        // System.out.println(count);
        return count<=h;
    }
}