class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        char c[]=s.toCharArray();
        int j=c[0];
        if(words.size()!=c.length) return false;


        for(int i=0;i<words.size();i++)
        {
            if(words.get(i).charAt(0)==c[i])
            {
              
            }
            else return false;
        }
        return true;
    }
}