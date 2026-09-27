class Solution {
    public int removeDuplicates(int[] nums) {
        Boolean[] list = new Boolean[nums.length];
        Arrays.fill(list, false);
        int left = 0;
        int right = 1;
        
        while(right < list.length){
            if(nums[left] == nums[right]){
                list[right] = true;
            }
            left++;
            right++;
        }
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < list.length; i++){
            if(!list[i])
                temp.add(nums[i]);
        }

        for(int i = 0; i < temp.size(); i++){
            nums[i] = temp.get(i);
        }
        
        return temp.size();
    }
}