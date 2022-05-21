class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String arr[]=s.split(" ");
        String temp=arr[arr.length-1];
        for (int i=0;i<temp.length();i++)
        {
            count++;
        }
        return count;
        
    }
}