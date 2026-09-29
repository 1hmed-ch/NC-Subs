class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int right = 1;

        while(right < nums.length){
            if(left != right){
                if(nums[left] == nums[right]){
                    if(Math.abs(right - left) <= k) return true;
                }
                else {
                    right++;
                }
            }
            if(right - left > k){
                left++;
                right = left + 1;
            }
        }

        return false;
    }
}