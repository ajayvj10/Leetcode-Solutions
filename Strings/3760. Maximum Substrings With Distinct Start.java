class Solution {
    public int maxDistinct(String s) {
        boolean[] seen = new boolean[65536];
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!seen[ch]) {
                seen[ch] = true;
                c++;
            }
        }

        return c;
    }
}