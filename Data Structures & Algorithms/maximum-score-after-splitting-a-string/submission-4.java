class Solution {
    public int maxScore(String s) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < s.length(); i++){
            String left = s.substring(0, i+1);
            String right = s.substring(i+1);
            temp = 0;
            for(int j = 0; j < left.length() && !right.isEmpty(); j++){
                if(left.charAt(j) == '0'){
                    temp++;
                }
            }
            for(int k = 0; k < right.length() && !left.isEmpty(); k++){
                if(right.charAt(k) == '1'){
                    temp++;
                }
            }
            count = Math.max(count, temp);
        }

        return Math.max(count, temp);
    }
}