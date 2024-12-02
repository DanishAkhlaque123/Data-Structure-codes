class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int count=1;
        for(String word : words){
            if(searchWord.length()<=word.length()){
                // System.out.println(count+", "+word);
                String subString = word.substring(0, searchWord.length());
                if(subString.equalsIgnoreCase(searchWord)){
                    return count;
                }
            }
            count++;
        }
        return -1;
    }
}