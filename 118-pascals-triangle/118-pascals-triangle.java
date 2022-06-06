class Solution {
    public List<List<Integer>> generate(int numRows) {
             ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        for(int i=1; i<=numRows; ++i){
          ArrayList<Integer> row = new ArrayList<>();
          for(int j=0;j<i;++j){
              if(j==0 || j==i-1) 
                  row.add(1);
              else {
                  row.add(ans.get(i-2).get(j-1)+ans.get(i-2).get(j));
              }  
          }
          ans.add(row); 
        }
        return ans;
    }
}