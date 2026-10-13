class Solution {
    public int appendCharacters(String s, String t) {
        int res = t.length();
        int first = 0;
        int second = 0;
        String temp = "";

        while(first < s.length() && second < t.length()){
            if(s.charAt(first) != t.charAt(second)){
                first++;
            } else {
                res--;
                temp += t.charAt(second);
                second++;
                first++;
            }
        }

        return res;
    }
}

//  s = "zabm" , t = "abcde" res = 3;


