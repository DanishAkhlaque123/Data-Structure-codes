class Solution {
    public int tribonacci(int n) {
        if(n==0 || n==1 )
            return n;
        if(n==2)
            return 1;
        n=n-2;
        int a=0;
        int b=1;
        int c=1;
        int sum=0;
        while(n-->0)
        {
            sum=a+b+c;
            
           
            a=b;
             b=c;
            c=sum;
           // System.out.println(a+" "+b+" "+c);
        }
        return sum;
        
    }
}