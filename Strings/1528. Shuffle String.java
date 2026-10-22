class Solution {
    public String restoreString(String s, int[] indices) {
        
        StringBuilder a= new StringBuilder();

        for(int i=0;i<indices.length;i++)
        {
            for(int j=0;j<indices.length;j++)
            {
            if(i==indices[j])
              {
                a.append(s.charAt(j)) ;
              }
            }
        }
        return a.toString();
    }
}