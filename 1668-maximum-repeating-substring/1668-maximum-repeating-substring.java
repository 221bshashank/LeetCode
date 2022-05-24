class Solution {
    public int maxRepeating(String sequence, String word) {
        int count =0;
        String temp=word;
        while(sequence.contains(word))
        {
            if(sequence.contains(word))
        {
                count++;
        }
            word=word+temp;

        }
        
        return count;
    }
}