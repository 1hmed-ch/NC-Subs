class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> str = Arrays.asList(strs);
        Map<String, List<String>> result = new HashMap<>();

        for(String s : str){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            // if(!result.containsKey(sortedS)){
            //     result.put(sortedS, new ArrayList<>());
            //     result.get(sortedS).add(s);
            // } else {
            //     result.get(sortedS).add(s);
            // }
            result.computeIfAbsent(sortedS, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
