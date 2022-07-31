class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
       List<String> ans=new ArrayList<>();
        int[] tar=new int[26];
        for(String s:words2)
        {
            int[] tar2=new int[26];
            for(char c:s.toCharArray())
            {
                tar2[c-'a']++;
            }
            
            for(int i=0;i<26;i++)
            {
                tar[i]=Math.max(tar[i],tar2[i]);
            }
        }
        
        for(String s1:words1)
        {
            int[] tar3=new int[26];
            for(char c:s1.toCharArray())
            {
                tar3[c-'a']++;
            }
            
            if(subset(tar3,tar))
                ans.add(s1);
            
        }
        
        return ans;
    }
    
    public boolean subset(int[] tar3,int[] tar)
    {
        for(int i=0;i<26;i++)
        {
            if(tar[i]>tar3[i])
            return false;   
        }
        return true;
        
    }
    
}