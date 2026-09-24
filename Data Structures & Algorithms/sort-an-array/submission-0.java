class Solution {
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public int[] sortArray(int[] nums) {
        int[] res = nums;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    //swap(res[j], res[i]);
                    int temp = res[j];
                    res[j] = res[i];
                    res[i] = temp;
                }
            }
        }
        return res;
    }
}