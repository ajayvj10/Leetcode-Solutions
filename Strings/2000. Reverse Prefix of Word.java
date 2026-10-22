class Solution {
    public String reversePrefix(String word, char ch) {
        int x=0,z=0;
        StringBuilder a= new StringBuilder();
      
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                x=i;
                z=i+1;
                break;
            }
            else{
                x=-1;
            }
        }
        for(int j=x;j>=0;j--)
        {
            a.append(word.charAt(j));
        }
        for(int i=z;i<word.length();i++)
        {
            a.append(word.charAt(i));
        }
        return a.toString();
    }
}