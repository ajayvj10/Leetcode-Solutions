class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
       int k=0;
       int arr[]= new int[words.length];
       for(int i=0;i<words.length;i++)
       {
        int sum=0;
        for(int j=0;j<words[i].length();j++)
        {
            char ch= words[i].charAt(j);
            int c=(int)ch-'a';
            sum+=weights[c];

        }
        arr[k++]= sum%26;
       } 
       char letter[]= new char[words.length];

       for(int i=0;i<arr.length;i++)
       {

         letter[i] = (char) ('z' - arr[i]);  
       }
       String news= new String(letter);

       return news;
    }
}