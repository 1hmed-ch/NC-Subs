class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // for(int i : nums){
        //     maxHeap.offer(i);
        // }
        // int res = 0;
        // for(int i = 0; i < k; i++){
        //     res = maxHeap.poll();
        // }
        // return res;
        Arrays.sort(nums);
        int res = 0;
        // for(int i = nums.length - 1; i > k; i--){
        //     res = nums[i];
        // }
        return nums[nums.length - k];
    }
}
