class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
       

        for (int i=0;i<s.length();i++)
        {
           if (s.charAt(i)=='1'&& count>=1)
           {
               return false;
           }
            
            if (s.charAt(i)=='0')
            {
                count++;
            }
        }
        return true;
    }
}