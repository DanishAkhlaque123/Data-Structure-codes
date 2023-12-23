class Solution {
    public int primePalindrome(int n) {
         if(n==1 || n==2){
            return 2;
        }
        //if n is even
        if(n%2==0){
            n++;
        }
        
        while(true){
            if(isPrime(n) && isPalindrome(n)){
                return n;
            }
            else{
                n=n+2;
            }
            if(n>10000000 && n<100000000){
                n=100000001;
            }
        }
    }
    
    private boolean isPrime(int n){
        for(int i=3; i*i<=n; i=i+2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    private boolean isPalindrome(int n){
        int new_number = 0;
        int n_copy=n;
        while(n>0){
            new_number = new_number*10 + n%10;
            n = n/10;
        }
        return n_copy==new_number || n_copy == new_number/10;
    }
}