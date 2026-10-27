import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        for (int num : nums1) {
            a.add(num);
        }

        for (int num : nums2) {
            if (a.contains(num)) {
                b.add(num);
            }
        }

        return b.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}