class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        Set<String> temp = new HashSet<>();

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(i != j && words[i].contains(words[j])){
                    temp.add(words[j]);
                }
            }
        }

        for(String s : temp)
            res.add(s);

        return res;
    }
}