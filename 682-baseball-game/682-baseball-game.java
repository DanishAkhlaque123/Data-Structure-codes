class Solution {
    public int calPoints(String[] ops) {
        int ans=0;
        int n=ops.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(ops[i].equals("+"))
            {
                int sum1=st.pop();
                int sum2=st.pop();
                int sum=sum1+sum2;
                st.push(sum2);
                st.push(sum1);
                
                st.push(sum);
            }
            else if(ops[i].equals("D"))
            {
                int dou=st.peek();
                dou=dou*2;
                st.push(dou);
            }
            else if(ops[i].equals("C"))
            {
                st.pop();
                
            }
            else 
            {
                st.push(Integer.parseInt(ops[i]));
            }
            //System.out.println(st.peek());
        }
        
        int sum3=0;
        while(st.size()>0)
            sum3+=st.pop();
        
        return sum3;
    }
}