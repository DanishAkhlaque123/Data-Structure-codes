class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        HashSet<String> hs1=new HashSet<>();
        HashSet<String> hs2=new HashSet<>();
        
        for(int i=0;i<words.length;i++)
        {
            hs1.add(words[i]);
            hs2.add(words[i]);
            
        }
        
        
        for(String word:hs1)
        {
            for(int i=0;i<word.length();i++)
            {
                String sub=word.substring(i+1);
                if(hs2.contains(sub))
                    hs2.remove(sub);
            }
        }
        
        
        int len=0;
        for(String s:hs2)
        {
            len+=s.length();
        }
        return len+hs2.size();
        
        
    }
}