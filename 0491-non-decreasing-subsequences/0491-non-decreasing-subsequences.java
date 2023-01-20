class Solution {
    int[] arr;
    HashSet<List<Integer>> hs=new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        arr=nums;
        rec(al,0);
        List<List<Integer>> ans=new ArrayList<>(hs);
        return ans;
    }
    
    public void rec(ArrayList<Integer> al,int idx){
        if(al.size()>=2)
            hs.add(new ArrayList(al));
        
        for(int i=idx;i<arr.length;i++){
                if(al.size()==0 || al.get(al.size()-1)<=arr[i]){
                    al.add(arr[i]);
                    rec(al, i+1);
                    al.remove(al.size()-1);
                }
        }
    }
}