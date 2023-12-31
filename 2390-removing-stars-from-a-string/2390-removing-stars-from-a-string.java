class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        String stringToReturn ="";
        while(st.size()!=0){
            stringToReturn = st.pop() + stringToReturn;
        }
        return stringToReturn;
    }
}