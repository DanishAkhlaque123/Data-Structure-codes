class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> hm = new HashMap<>();

        // System.out.println(hm);
        int si=0;
        int ei=0;
        int ans=0;
        while(ei<fruits.length){
            hm.put(fruits[ei],hm.getOrDefault(fruits[ei],0)+1);
            if(hm.size()>2){
                ans = Math.max(ans, (ei-si));
                while(hm.size()!=2){
                    if(hm.containsKey(fruits[si])){
                        int val = hm.get(fruits[si]);
                        if(val==1){
                            hm.remove(fruits[si]);
                        }else{
                            hm.put(fruits[si], val-1);
                        }
                        si++;
                    }
                }
            }else{
                ans = Math.max(ans, ei-si+1);
            }
            ei++;
            
        }
        return ans;
    }
}