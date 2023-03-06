class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<20000;i++){
            if(!hs.contains(i)){
                al.add(i);
            }
        }
        return al.get(k-1);
    }
}