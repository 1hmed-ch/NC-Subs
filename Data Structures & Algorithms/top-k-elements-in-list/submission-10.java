class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> rs = new ArrayList<>();

        for(int i : nums){
            map.computeIfAbsent(i, v -> new ArrayList<>()).add(i);
        }
        for(List<Integer> list : map.values()){
            rs.add(list);
        }
        rs.sort((list1, list2) -> Integer.compare(list2.size(), list1.size()));
        
        int[] result = new int[k];
        for(int i = 0; i<k; i++){
            result[i] = rs.get(i).get(0);
        }
        return result;
    }
}
