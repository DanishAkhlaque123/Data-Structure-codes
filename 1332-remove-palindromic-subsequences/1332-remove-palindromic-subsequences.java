class Solution {
    public int removePalindromeSub(String s) {
        int i=0;
        int j=s.length()-1;
        int count=0;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
                
            }
            else
            {
                count++;
                break;
            }
        }
        if(count==0)
            return 1;
        
        
        
        return 2;
    }
}