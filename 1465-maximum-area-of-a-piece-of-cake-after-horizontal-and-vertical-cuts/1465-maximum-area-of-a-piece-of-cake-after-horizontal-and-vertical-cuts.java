class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
         int n=horizontalCuts.length-1;
        int m=verticalCuts.length-1;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long hori=horizontalCuts[0];
        long ver=verticalCuts[0];
        
        for(int i=1;i<horizontalCuts.length;i++)
        {
            hori=Math.max(hori,horizontalCuts[i]-horizontalCuts[i-1]);
            
        }
       // int n=horizontalCuts.lenght-1;
         hori=Math.max(hori,h-horizontalCuts[n]);
        int h1=(int)(hori)%(int)((1e9)+7);
         
        
         for(int i=1;i<verticalCuts.length;i++)
        {
            ver=Math.max(ver,verticalCuts[i]-verticalCuts[i-1]);
            
        }
        
         ver=Math.max(ver,w-verticalCuts[m]);
      //  System.out.println(ver);
         long ans=hori*ver;
        return (int)(ans%(int)(1e9+7));
    }
}