class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> st = new Stack<>();
        int count=0;
        int ans=0;
        while(count<n){
            char ch = s.charAt(count);
            if(ch==')'){
                if(st.size()==0){
                    ans++;
                }
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }
            }
            else{
                st.push('(');
            }
            count++;
        }
        return ans+st.size();
    }
}