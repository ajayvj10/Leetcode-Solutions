class Solution {
    public int differenceOfSums(int n, int m) {

    int a[]= new int[n];
    int b[]= new int[n];
    int j=0;
    for(int i=1;i<=n;i++)
    {
        if(i%m!=0){
            a[j++]=i;
        }
        else{
            b[j++]=i;
        }
    }
    int sum1=0,sum2=0;

    for(int i=0;i<n;i++){
        sum1+=a[i];
        sum2+=b[i];
    }
    return sum1-sum2;
    
        
    }
}