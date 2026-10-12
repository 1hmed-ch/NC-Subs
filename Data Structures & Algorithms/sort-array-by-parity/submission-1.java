class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;

        int i = 0;
        while(l < nums.length){
            if(nums[l]%2 == 0){
                res[i] = nums[l++];
                i++;
            } else {
                res[r--] = nums[l++];
            }
        }

        return res;
    }
}