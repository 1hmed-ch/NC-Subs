class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortColors(int[] nums) {
        int l = 0;
        int curr = 0;
        int r = nums.length - 1;
        while(curr <= r){
            if(nums[curr] == 2){
                swap(nums, curr , r);
                r--;
            } else if(nums[curr] == 0){
                swap(nums, curr , l);
                curr++;
                l++;
            } else {
                curr++;
            }
        }
    }
}