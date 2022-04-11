// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int getCount (String s, int N)
    {
        ArrayList<Character> al=new ArrayList<>();
        al.add(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            al.add(s.charAt(i));
        }
        //System.out.println(al);
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<al.size();i++)
        {
            if(hm.containsKey(al.get(i)))
            {
                hm.put(al.get(i),hm.get(al.get(i))+1);
            }
            else
            {
                hm.put(al.get(i),1);
            }
        }
        int count=0;
        for(Character k:hm.keySet())
        {
            if(hm.get(k)==N)
            count++;
        }
        return count;
    }
}