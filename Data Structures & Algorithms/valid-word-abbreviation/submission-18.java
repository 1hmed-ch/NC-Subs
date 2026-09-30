class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int first = 0;
        int second = 0;
        String num = "";
        while(first < word.length() && second < abbr.length()){
            if(word.charAt(first) != abbr.charAt(second)){
                if(Character.isDigit(abbr.charAt(second)) && abbr.charAt(second) != '0'){
                    while(second < abbr.length() && Character.isDigit(abbr.charAt(second))){
                        num += abbr.charAt(second);
                        second++;
                    }
                    first += Integer.valueOf(num);
                    num = "";
                } else {
                    return false;
                }
            } else {
                first++;
                second++;
            }
        }

        // for(String s :str){
        //     System.out.println(s + " " + str.length);
        // }


        
        return first == word.length() && second == abbr.length() ? true : false;
    }
}