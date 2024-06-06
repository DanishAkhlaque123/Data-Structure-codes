class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        int count=hand.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int val : hand){
            if(hm.containsKey(val)){
                hm.put(val, hm.get(val)+1);
            }
            else{
                hm.put(val, 1);
            }
        }
        for(int i=0; i<hand.length;i++){
            int val = hand[i];
            if(!hm.containsKey(val)){
                continue;
            }
            int size = groupSize;
            while(size>0){
                if(hm.containsKey(val)){
                    size--;
                    hm.put(val, hm.get(val)-1);
                }
                else{
                    return false;
                }
                if(hm.get(val)==0){
                    hm.remove(val);
                }
                val++;
            }
        }
        if(hm.size()>0){
            return false;
        }
        
        return true;
    }
}