class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch = s1.toCharArray();
        char[] toSearchFrom = s2.toCharArray();
        // int[] chFreq = new int[128];
        // for(char val : ch){
        //     chFreq[val-'a']++;
        // }
        
        for(int i=0;i<s2.length();i++){
            int requirements=s1.length();
            int[] chNewFreq = new int[128];
            for(char val : ch){
            chNewFreq[val-'a']++;
            }
            for(int j=i;j<s2.length();j++){
                if(chNewFreq[toSearchFrom[j]-'a']>0){
                    // System.out.println(s2.substring(i, j+1));
                    requirements--;
                    chNewFreq[toSearchFrom[j]-'a']--;
                    if(requirements==0){
                        // System.out.println(s2.substring(i, j+1));
                        return true;
                    }
                }
                else{
                    // System.out.println("Break - ->"+s2.substring(i, j+1));
                    break;
                }
            }
        }
    
        return false;
    }
}