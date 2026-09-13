class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        if(s.length() == 1) return 1;
        if(s.length() == 2 && s.charAt(0) != s.charAt(1)) return 2;
        int left = 0;
        int right = 1;
        char[] sArr = s.toCharArray();
        Set<Character> res = new HashSet<>();
        res.add(sArr[0]);
        int count = 0;
        while(right < sArr.length){
            if(!res.contains(sArr[right])){
                res.add(sArr[right]);
                right++;
            }else {
                count = Math.max(count, res.size());
                res.remove(sArr[left]);
                left++;
            }
        }
        count = Math.max(count, res.size());
        return count;
    }
}
