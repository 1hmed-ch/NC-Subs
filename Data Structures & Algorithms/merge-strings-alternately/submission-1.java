class Solution {
    public String mergeAlternately(String word1, String word2) {
        int first = 0;
        int second = 0;
        StringBuilder sb = new StringBuilder();
        if(word1.length() >= word2.length()){
            while(second < word2.length()){
                sb.append(word1.charAt(first++)).append(word2.charAt(second++));
            }
            if(word1.length() > word2.length()){
                sb.append(word1.substring(second));
            }
        } else {
            while(first < word1.length()){
                sb.append(word1.charAt(first++)).append(word2.charAt(second++));
            }
            sb.append(word2.substring(first));
        }

        return sb.toString();
    }
}