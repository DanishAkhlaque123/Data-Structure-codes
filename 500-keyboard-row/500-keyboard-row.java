class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> h1=new HashSet<>();
        HashSet<Character> h2=new HashSet<>();
        HashSet<Character> h3=new HashSet<>();
        ArrayList<String> ans=new ArrayList<>();
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            
                h1.add(ch);
            
        }
          for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            
                h2.add(ch);
            
        }
          for(int i=0;i<s3.length();i++)
        {
            char ch=s3.charAt(i);
            
                h3.add(ch);
            
        }
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<words.length;i++)
        {
            count1=0;
            count2=0;
            count3=0;
            String s5=words[i];
            String s=s5.toLowerCase();
            //System.out.println(s);
            for(int j=0;j<s.length();j++)
            {
                char ch1=s.charAt(j);
                if(h1.contains(ch1))
                {
                    count1++;
                }
                if(h2.contains(ch1))
                {
                    count2++;
                }
                if(h3.contains(ch1))
                {
                    count3++;
                }
            }
           // System.out.println(count2);
            
            if(count1==s.length() || count2==s.length() || count3==s.length())
            {
                ans.add(s5);
            }
        }
        //System.out.println(ans.size());
        
        String[] ans1=new String[ans.size()];
        int k=0;
        for(String s4:ans)
        {
            ans1[k]=s4;
            k++;
        }
        return ans1;
        
    }
}