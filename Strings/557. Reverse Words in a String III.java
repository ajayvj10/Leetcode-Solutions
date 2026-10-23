class Solution {
    public String reverseWords(String s) {

     StringBuilder sb= new StringBuilder();

     String[]a = s.split(" ");

     for(int i=0;i<a.length;i++)
     {
        for(int j=a[i].length()-1;j>=0;j--)
        {
          sb.append(a[i].charAt(j));
        }
        sb.append(" ");
     }  
     return sb.toString().trim(); 
    }
}