class Solution {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;

        while(r < nums.length){
            if(nums[l] == 0 && nums[r] != 0){
                swap(nums, l, r);
                l++;
            } else if(nums[l] != 0) l++;
            r++;
        }
    }
}