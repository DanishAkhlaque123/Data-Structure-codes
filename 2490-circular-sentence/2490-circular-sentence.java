class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] val =sentence.split(" ");
        if(val.length==1){
            if(val[0].charAt(0)==val[0].charAt(val[0].length()-1)){
                return true;
            }
            else{
                return false;
            }
        }
        
        for(int i=1;i<val.length;i++){
            // System.out.println(val[i]);
            if(val[i].charAt(0)==val[i-1].charAt(val[i-1].length()-1)){
                continue;
            }else{
                return false;
            }
            
        }
        // System.out.println("outside loop");
                if(val[0].charAt(0)==val[val.length-1].charAt(val[val.length-1].length()-1)){
                    return true;
                }
                else{
                    return false;
                }
            
        
    }
}