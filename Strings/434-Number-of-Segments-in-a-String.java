class Solution {
    public int countSegments(String s) {
      int c=0;
    
     String a[]=s.split(" ");

     for(String w:a)
     {
        if(!w.isEmpty())c++;
     }
     return c;
    }
}