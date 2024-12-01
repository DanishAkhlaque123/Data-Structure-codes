class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], i);
        }
        for(int i=0;i<arr.length;i++){
            int valToFind = arr[i]*2;
            if(hm.containsKey(valToFind)==true && hm.get(valToFind)!=i){
                return true;
            }
        }
        return false;
    }
}