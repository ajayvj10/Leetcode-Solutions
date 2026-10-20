import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> list = new ArrayList<>();
        int max=candies[0];
        
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max) max=candies[i];
        } 

        for(int i=0;i<candies.length;i++)
        {
           int x= candies[i]+extraCandies;
           if(x>=max) list.add(true);
           else list.add(false);
        }
        return list;
    }
}