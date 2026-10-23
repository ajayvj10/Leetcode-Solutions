class Solution {
    public int countAsterisks(String s) {
        int c=0;
        int ck=0;
        char ar[]=s.toCharArray();
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]=='*')
            {
                c++;
            }
        }
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)=='|' && s.charAt(j)=='|')
                {
                    for(int k=i+1;k<j;k++)
                    {
                       if(s.charAt(k)=='*')ck++;
                    }
                   i=j;
                    break;
                }
                 
            }
        }
        return c-ck;
    }
}