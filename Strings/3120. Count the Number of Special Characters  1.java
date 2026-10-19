class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        for(char i='a';i<='z';i++)
        {
            boolean u= false;
            boolean l=false;
            for(int j=0;j<word.length();j++)
            {
                if(word.charAt(j)==i)
                {
                    l=true;
                }
                if(word.charAt(j)==Character.toUpperCase(i))
                {
                    u= true;
                }
            }
            if(u&&l==true)c++;
        }
        return c;
    }
}