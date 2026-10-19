class Solution {
    public String reversePrefix(String s, int k) {

    StringBuilder a= new StringBuilder();

    for(int i=k-1;i>=0;i--)
    {
        a.append(s.charAt(i));

    }
    for(int i=k;i<s.length();i++)
    {
        a.append(s.charAt(i));
    }
    return a.toString();
}
}