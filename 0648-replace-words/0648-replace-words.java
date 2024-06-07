class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        Set<String> dict = new HashSet<>();
        for(String word : dictionary){
            dict.add(word);
        }
        for(int i=0;i<words.length;i++){
            String word = words[i];
            int len = Integer.MAX_VALUE;
            String replacedWord="";
            for(String root : dict){
                if(word.startsWith(root)){
                    if(root.length()<len){
                        len = root.length();
                        replacedWord = root;
                    }
                }
            }
            if(len!=Integer.MAX_VALUE){
                words[i]=replacedWord;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : words){
            sb.append(s+" ");
        }
        // System.out.println(sb);
        return sb.toString().trim();
    }
}