class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        int maj = 0;
        for(Map.Entry<Integer, Integer> k : freq.entrySet()){
            if(k.getValue() > nums.length/2){
                maj = k.getKey();
            }
        }

        return maj;
    }
}