class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        Arrays.sort(strs);
        StringBuilder res = new StringBuilder();
        char[] firstWord = strs[0].toCharArray();
        char[] lastWord = strs[strs.length - 1].toCharArray();
        int n = firstWord.length <= lastWord.length ? firstWord.length : lastWord.length;
        
        for(int i = 0; i < n; i++){
            if(firstWord[i] == lastWord[i]){
                res.append(firstWord[i]);
            } else break;
        }
        return new String(res);
    }
}