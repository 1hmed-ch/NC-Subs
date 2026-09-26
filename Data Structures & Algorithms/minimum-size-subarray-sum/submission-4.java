class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target) return 1;
        }

        //for(int i = 0; i < nums.length; i++){
        int left = 0;
        int right = 1;
        sum = nums[left];
        while(right <= nums.length){
            if(sum < target){
                if(right < nums.length)
                    sum += nums[right];
                right++;
            }
            else {
                sum -= nums[left];
                //if(sum >= target)
                    minValue = Math.min(minValue, right - left);
                left++;
            }
        }
        //minValue = Math.min(minValue, right - left);
        //}

        System.out.println(minValue);

        return minValue == Integer.MAX_VALUE ? 0 : minValue;


        
    }
}