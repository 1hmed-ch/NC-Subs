class Solution {
    public static boolean isPalindrome(String s){
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while(left < right){
            if(charArray[left] == charArray[right]){
                left++;
                right--;
            } else return false;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        int tolerance = 0;

        while(left < right){
            if(charArray[left] == charArray[right]){
                left++;
                right--;
            } else {
                tolerance++;
                if(isPalindrome(s.substring(left+1, right + 1)) && tolerance <= 1){
                    return true;
                } else if(isPalindrome(s.substring(left, right)) && tolerance <= 1){
                    return true;
                } 
                if(tolerance > 1) break;
            }
        }

        return tolerance > 1 ? false : true;
    }
}