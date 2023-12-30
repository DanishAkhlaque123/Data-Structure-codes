class Solution {
    String[] pnum = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        if(digits.length()==1){
            List<String> el = new ArrayList<>();
            int index = Integer.parseInt(digits.charAt(0)+"");
            String s=pnum[index-2];
            for(int i=0;i<s.length();i++){
                el.add(s.charAt(i)+"");
            }
            return el;
        }
        int val = Integer.parseInt(digits.charAt(0)+"")-2;
        String toAdd = pnum[val];
        List<String> pa = letterCombinations(digits.substring(1));
        List<String> ans = new ArrayList<>();
        for(int j=0;j<toAdd.length();j++){
            char addVal = toAdd.charAt(j);
            for(int k=0;k<pa.size();k++){
                String valInAns = addVal+pa.get(k);
                ans.add(valInAns);
            } 
            
        }
        return ans;
    }
}