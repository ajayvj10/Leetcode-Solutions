
class Solution {
    public int prefixCount(String[] words, String pref) {
       
        int finalcount=0;
        for (int i = 0; i < words.length; i++) {
             int c = 0;
               if (words[i].length() < pref.length()) {
                continue;
               }
            for (int j = 0; j < pref.length(); j++) {
                if (words[i].charAt(j) == pref.charAt(j)) {
                    c++;
                }
                else break;
            }

            if (c == pref.length()) {
                finalcount++;
            }
        }

        return finalcount;
    }
}
