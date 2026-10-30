
class Solution {
    public int dominantIndex(int[] nums) {

      int max=0;
      int a[]= new int[nums.length];
      int k=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>max)
        {
            max=nums[i];
            k=i;
        }
      }  
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]== max){
            a[i]=1;
            continue;
        }
        else if(nums[i]*2<=max)
        {
            a[i]=1;
        }
      }
      for(int i=0;i< nums.length;i++)
      {
        if(a[i]==0) return -1 ;
      }
      return k;
    }
}