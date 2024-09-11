class Solution {
    public int minBitFlips(int start, int goal) {
        String sta = getBinary(start);
        String goa = getBinary(goal);
        // System.out.println("sta =>"+sta+", goa => "+goa);
        int count=0;
        for(int i=0;i<Math.max(sta.length(), goa.length());i++){
            char chSta = i>=sta.length()?'0':sta.charAt(sta.length()-i-1);
            char chGoa = i>=goa.length()?'0':goa.charAt(goa.length()-i-1);
            if(chSta!=chGoa){
                count++;
            }
        }
        return count;
    }
    
    private String getBinary(int val){
        String binary="";
        while(val>0){
            if(val%2==0){
                binary = 0+binary;
            }
            else{
                binary = 1+binary;
            }
            val = val/2;
        }
        return binary;
    }
}