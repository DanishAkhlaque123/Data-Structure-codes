class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if(str1.length()<str2.length()){
            return false;
        }
        int[] string1 = new int[str1.length()];
        for(int i=0;i<str1.length();i++){
            int val = str1.charAt(i)-'a'+1;
            string1[i]=val;
        }
        
        int[] string2 = new int[str2.length()];
        for(int i=0;i<str2.length();i++){
            int val = str2.charAt(i)-'a'+1;
            string2[i]=val;
        }
        int i=0;
        int j=0;
        int count=0;
        while(i<string1.length){
            int valToMatch = string2[j];
            while(i<string1.length && (string1[i]+1)%26!=valToMatch  && (string1[i]+1)!=valToMatch && string1[i]!=valToMatch){
                // System.out.println("valToMatch="+valToMatch+", "+string1[i]+", i="+i+", j="+j);
                i++;
            }
            j++;
            if(i<string1.length){
                count++;
            }
            if(j>=str2.length()){
                break;
            }
            i++;
        }
        System.out.println("count="+count+", j="+j+", i="+i);
        return count==str2.length() ? true : false;
        // return false;
    }
}