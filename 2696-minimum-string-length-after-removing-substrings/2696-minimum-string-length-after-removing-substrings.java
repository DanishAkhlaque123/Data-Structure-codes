class Solution {
    public int minLength(String s) {
        while(s.toLowerCase().contains("ab") || s.toLowerCase().contains("cd")){
            if(s.toLowerCase().contains("ab")){
            int sIndex = s.toLowerCase().indexOf("ab");
            s = s.substring(0, sIndex)+s.substring(sIndex+2);
        }   
            
            if(s.toLowerCase().contains("cd")){
            int sIndex = s.toLowerCase().indexOf("cd");
            s = s.substring(0, sIndex)+s.substring(sIndex+2);
        } 
        }
        return s.length();
    }
}