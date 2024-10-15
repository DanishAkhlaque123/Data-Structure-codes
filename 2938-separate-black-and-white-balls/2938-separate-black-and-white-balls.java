class Solution {
    public long minimumSteps(String s) {
        long count = 0;
        String[] val = s.split("");
        int i = 0;
        int j = 0;
         
        while(j<val.length){
            if(val[j].equals("0")){
                if(val[i]!=val[j]){
                    count+=(j-i);
                    // System.out.println(i+", "+j);
                }
                swap(i,j,val);
                 
                i++;
                j++;
            }
            else{
                j++;
            }
            
        }
        // if(count==s.length()){
        //         return 0;
        //     }
        return count;
    }
    
    public static void swap(int i, int j, String[] val){
        String value = val[i];
        val[i]=val[j];
        val[j]=value;
    }
}