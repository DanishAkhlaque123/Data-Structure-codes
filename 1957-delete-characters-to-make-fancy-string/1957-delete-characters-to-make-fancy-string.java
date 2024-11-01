class Solution {
    public String makeFancyString(String s) {
        char[] val = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();){
            char vh = val[i];
            int count=1;
            int j=i;
            while(j+1<s.length() && val[j+1]==val[i]){
                count++;
                j++;
            }
            // System.out.print(count+", "+i+", "+j+", ");
            if(count>=2){
                sb.append(val[i]).append(val[i]);
            }else{
                sb.append(val[i]);
            }
           
            // System.out.println(i+", "+j);
            i+=count;
           
        }
        return sb.toString();
    }
}
