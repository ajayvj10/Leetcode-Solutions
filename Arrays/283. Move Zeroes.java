class Solution {
    public void moveZeroes(int[] nums) {
        
        int a[]=new int[nums.length];
        int k=0,z=0;
        for(int i=0;i<nums.length;i++)
        {   
            if(nums[i]!=0)
            {
                a[k]=nums[i];
                nums[z++]=a[k];
                k++;
            }
        }
        while(k<nums.length)
        {
            nums[k++]=0;
        }
      
    }
}