class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(String word:words)
        {
            if(isMatching(word,pattern))
                ans.add(word);
        }
        return ans;
    }
    
    public boolean isMatching(String word, String pattern)
    {
        HashMap<Character, Character> hm=new HashMap<>();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<pattern.length();i++)
        {
            char pch=pattern.charAt(i);
            char wch=word.charAt(i);
            if(hm.containsKey(pch))
            {
                if(hm.get(pch)!=wch)
                    return false;
            }
            else
            {
                if(hs.contains(wch))
                    return false;
                hm.put(pch,wch);
                hs.add(wch);
            }
        }
        return true;
    }
    
}