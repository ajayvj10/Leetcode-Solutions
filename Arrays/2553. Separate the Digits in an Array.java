import java.util.ArrayList;
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>(); 
        for(int num : nums){
            String s = Integer.toString(num);
            for(int i=0; i<s.length(); i++) arr.add(s.charAt(i) - '0');
        }
        int l = arr.size(), a[] = new int[l];
        for(int i=0; i<l; i++) a[i] = arr.get(i);
        return a;
    }
}