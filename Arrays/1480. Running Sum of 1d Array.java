class Solution {
    public int[] runningSum(int[] nums) {
        
       int a[]= new int[nums.length];
       a[0]=nums[0];
       for(int i=1;i<nums.length;i++)
       {   int sum=0;
        for(int j=i-1;j>=0;j--)
        {
          sum+=nums[j]; 
        }
        a[i]=sum+nums[i];
       } 
       return a;
    }
}