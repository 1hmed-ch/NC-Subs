class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] rs = new int[k];

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashMap<Integer, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
                LinkedHashMap::new
            ));
        int i = 0;
        for(var c : sortedMap.entrySet()){
            if(i < k)
                rs[i] = c.getKey();
            i++;
        }
        // for(List<Integer> list : map.values()){
        //     rs.add(list);
        // }
        // rs.sort((list1, list2) -> Integer.compare(list2.size(), list1.size()));
        
        // int[] result = new int[k];
        // for(int i = 0; i<k; i++){
        //     result[i] = rs.get(i).get(0);
        // }
        return rs;
    }
}
