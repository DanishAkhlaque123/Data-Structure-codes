class Solution {
    int[] par;
    public int findpar(int u)
    {
        if(par[u]==u)
            return u;
        int p=findpar(par[u]);
        par[u]=p;
        return p;
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        par=new int[10001];
        for(int i=0;i<10001;i++)
        {
            par[i]=i;
        }
        
        HashMap<String,Integer> euid=new HashMap<>(); //email to id
        HashMap<String,String> etn=new HashMap<>(); //email to name
        int uid=0;
        for(List<String> account:accounts)
        {
            String name="";
            for(String email:account)
            {
                if(name=="")
                {
                    name=email;
                    continue;
                }
                if(!euid.containsKey(email))
                {
                    euid.put(email,uid);
                    uid++;
                }
                if(!etn.containsKey(email))
                {
                    etn.put(email,name);
                }
                
                int e1uid=euid.get(account.get(1));
                int cuid=euid.get(email);
                
                int p1=findpar(e1uid);
                int p2=findpar(cuid);
                
                if(p1!=p2)
                {
                    par[p2]=p1;
                }
            }
        }
        
        
        HashMap<Integer,List<String>> pte=new HashMap<>();
        for(String email:etn.keySet())
        {
            int cuid=euid.get(email);
            int par=findpar(cuid);
            if(pte.containsKey(par))
            {
                pte.get(par).add(email);
            }
            else
            {
                pte.put(par,new ArrayList<>());
                pte.get(par).add(email);
            }
        }
        
        List<List<String>> ans=new ArrayList<>();
        for(List<String> emails:pte.values())
        {
            Collections.sort(emails);
            List<String> tp=new ArrayList<>();
            String email=emails.get(0);
            String name=etn.get(email);
            tp.add(name);
            for(String e:emails)
            {
                tp.add(e);
            }
            ans.add(new ArrayList<>(tp));
            
        }
        return ans;
    }
}