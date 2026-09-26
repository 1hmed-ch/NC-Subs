class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target) return 1;
        }

        for(int i = 0; i < nums.length; i++){
            int left = i;
            int right = i + 1;
            sum = nums[left];
            while(sum < target && right < nums.length){
                sum += nums[right++];
            }
            if(sum >= target)
                minValue = Math.min(minValue, right - left);
        }

        // if(Arrays.stream(nums).sum() < target){
        //     return 0;
        // }

        System.out.println(minValue);

        return minValue == Integer.MAX_VALUE ? 0 : minValue;
    }
}