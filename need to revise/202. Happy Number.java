class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n!=1 && n!=4){
            sum=0;
        while(n>0)
        {
            int dig= n%10;
            dig=dig*dig;
            sum+=dig;
            n=n/10;

        }
        n=sum;
        
        }
       return n==1;
    }
}