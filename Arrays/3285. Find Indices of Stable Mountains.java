import java.util.*;
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        
        List<Integer> a= new ArrayList<>();
        
        for(int i=0;i<height.length-1;i++)
        {
            if(height[i]>threshold)
            {
               a.add(i+1);
            }
        }
        return a;
    }
}