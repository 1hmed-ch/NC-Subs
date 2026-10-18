class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<>();
        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] sArray = s.toCharArray();

        for(int i = 0; i < sArray.length; i++){
            if(charMap.containsKey(sArray[i]) && charMap.get(sArray[i]) == t.charAt(i)){
                continue;
            } else if(!charMap.containsKey(sArray[i]) && !charMap.containsValue(t.charAt(i))){
                charMap.put(sArray[i], t.charAt(i));
            } else {
                return false;
            }
        }

        return true;
    }
}