class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(hm.containsKey(c))
            {
               hm.put(c,hm.get(c)+1);
            }
            else
            {
                hm.put(c,1);
            }
            
        }
        
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            if(hm.containsKey(c))
            {
                int t1=hm.get(c);
                if(t1==1)
                    hm.remove(c);
                else
                    hm.put(c,hm.get(c)-1);
            }
            else
            {
                return false;
            }
        }
        if(hm.size()==0)
            return true;
        return false;
        
        
        
    }
}