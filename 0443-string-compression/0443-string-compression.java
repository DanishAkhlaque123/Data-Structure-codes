class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        StringBuilder sb=new StringBuilder();
        
        if(chars.length==1)
            return 1;
        int i=0;
        while(i<n){
            
            if(i+1<n && chars[i]==chars[i+1]){
                int count=0;
                int j=i;
                while(j<n && chars[j]==chars[i]){
                    count++;
                    j++;
                }
                
                sb.append(chars[i]);
                sb.append(count);
                i=j;
            }
            else
            {
                sb.append(chars[i]);
                i++;
            }
        }
        String ansString = sb.toString();
        int index=0;
        for(int j=0;j<ansString.length();j++){
            char c=ansString.charAt(j);
            chars[j]=c;
        }
        for(int j=ansString.length();j<n;j++){
            chars[j]='\u0000';
        }
        return sb.toString().length();
    }
}