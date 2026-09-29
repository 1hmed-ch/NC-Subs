class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        int maj = 0;
        for(var k : freq.entrySet()){
            if(k.getValue() > nums.length/2){
                maj = k.getKey();
                break;
            }
        }

        return maj;
    }
}