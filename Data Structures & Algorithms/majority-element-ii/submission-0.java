class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) > n && !res.contains(i)){
                res.add(i);
            }
        }

        return res;
    }
}