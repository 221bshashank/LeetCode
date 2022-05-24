class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min=Math.min(word1.length(),word2.length());
        int max=Math.max(word1.length(),word2.length());
        StringBuilder sb=new StringBuilder();
        for (int i=0,j=0;i<min;i++,j++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
        }
        for (int i=min;i<max;i++)
        {
            if (max==word1.length())
            {
                sb.append(word1.charAt(i));
            }
            else
            {
                sb.append(word2.charAt(i));

            }
        }
        return sb.toString();
    }
}