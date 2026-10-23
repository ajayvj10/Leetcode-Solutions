class Solution {
    public String sortSentence(String s) {
        
        String a[]=s.split(" ");
        String arr[]= new String[a.length];
        for(int i=0;i<a.length;i++)
        {
         int l=a[i].charAt(a[i].length()-1)-'0';
         arr[l-1]=a[i].substring(0,a[i].length()-1);
        }
        return String.join(" ",arr);
    }
}