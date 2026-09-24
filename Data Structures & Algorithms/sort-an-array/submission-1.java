class Solution {
    public static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int[] sortArray(int[] nums) {
        int[] res = nums;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    swap(res, i, j);
                    // int temp = res[j];
                    // res[j] = res[i];
                    // res[i] = temp;
                }
            }
        }
        return res;
    }
}