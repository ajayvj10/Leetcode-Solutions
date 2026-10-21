class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        boolean flag =false;
        for(int i=0;i<nums.length;i++)
        {   
            
            while(nums[i]>0)
            {
                int dig= nums[i]%10;
                if(dig==digit){
                    c++;
                    flag = true;
                }
                nums[i]=nums[i]/10;
            }
        }
        if(flag)return c;

        return 0;
    }
}