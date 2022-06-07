class Solution {
    public int[] countBits(int n) {
        int[] a=new int[n+1];
        a[0]=0;
        for(int i=1;i<=n;i++)
        {
            int n1=i;
            int res=0;
            while(n1>0)
            {
                n1=(n1&(n1-1));
                res++;
            }
            a[i]=res;
        }
        return a;
    }
}