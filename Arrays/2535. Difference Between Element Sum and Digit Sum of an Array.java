class Solution {
    public int differenceOfSum(int[] nums) {
     int sum=0;
     int esum=0;
     for(int i=0;i<nums.length;i++)
     {
        sum+=nums[i];
        int n=nums[i];
        while(n>0)
        {
            int dig=n%10;
            esum+=dig;
            n=n/10;
        }
     } 
     return Math.abs(sum-esum);  
    }
}