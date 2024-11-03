class Solution {
    public boolean rotateString(String s, String goal) {
        char ch1 = s.charAt(0);
        int idx = 0;
        while(idx<goal.length()){
            if(goal.charAt(idx)==ch1){
                String left = goal.substring(idx);
                String right = goal.substring(0, idx);
                if(s.equals(left+right)){
                    return true;
                }
            }
            idx++;
        }
        return false;
    }
}