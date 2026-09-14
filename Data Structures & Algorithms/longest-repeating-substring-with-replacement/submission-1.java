class Solution {
    public int characterReplacement(String s, int k) {
        if(s.isEmpty()) return 0;
        int l = 0;
        int r = 0;
        int count = 0;
        int maxFreq = 0;
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        while(r < arr.length){
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(arr[r]));

            while(r - l + 1 - maxFreq > k){
                map.put(arr[l], map.getOrDefault(arr[l], 0) - 1);
                l++;
            }

            count = Math.max(count, r - l + 1);
            r++;
        }

        return count;
    }
}
