class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb=new StringBuilder();
        String ans=fun(s);
        ans=ans.toLowerCase();
        for (int i=ans.length()-1;i>=0;i--)
        {
            sb.append(ans.charAt(i));
        }
        
        if (ans.equals(sb.toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String fun(String s)
    {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            if ( (s.charAt(i)>=32 && s.charAt(i)<=47) || (s.charAt(i)>=58 && s.charAt(i)<=64)
                || (s.charAt(i)>=91 && s.charAt(i)<=96) || (s.charAt(i)>=123 && s.charAt(i)<=126))
               
            {
                continue;
            }
            else
            {
                sb.append(s.charAt(i));
            }
            
        }
        return sb.toString();
    }
}