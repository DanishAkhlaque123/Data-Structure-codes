class Solution {
    public int reverse(int x) {
        if(x>Integer.MAX_VALUE || x==Integer.MIN_VALUE ||x==0){
            return 0;
        }
        int count=0;
        int xCopy = x;
        boolean negativeVal=false;
        while(xCopy>0){
            count++;
            xCopy=xCopy/10;
        }
        if(x<0){
            negativeVal=true;
            x=Math.abs(x);
        }
        if(negativeVal){
            return (-1)*reverseNum(x, "");
        }
        return reverseNum(x, "");
    }
    
    private int reverseNum(int x, String ans){
        if(ans!="" && Long.parseLong(ans)>Integer.MAX_VALUE)        {
            return 0;
        }
        if(x==0){
            return Integer.parseInt(ans);
        }
        return reverseNum(x/10, ans+x%10);
    }
}