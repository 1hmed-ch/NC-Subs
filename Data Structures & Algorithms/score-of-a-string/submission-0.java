class Solution {
    public int scoreOfString(String s) {
        char[] arr = s.toCharArray();
        int score = 0;

        for(int i = 1; i < arr.length; i++){
            score += Math.abs(arr[i] - arr[i-1]);
        }

        return score;
    }
}