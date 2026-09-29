class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] >= target) return 0;
            else return 1;
        }
        int l = 0;
        int r = nums.length - 1;
        int res = -1;

        while(l <= r){
            int mid = l + (r - l)/2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                l = mid + 1;
                res = l;
            } else {
                r = mid - 1;
                res = r;
                // if(nums[r] >= target)
                //     res = r;
            }
        }

        return l;
    }
}