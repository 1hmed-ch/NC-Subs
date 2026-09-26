class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i = 0; i < nums2.length; i++){
        //     nums1[m + i] = nums2[i];
        // }
        // Arrays.sort(nums1);
        int l = m - 1;
        int c = n - 1;
        int r = m + n - 1;
        while(c >= 0 && l >= 0){
            if(nums1[l] < nums2[c]){
                nums1[r] = nums2[c];
                c--;
                r--;
            } else {
                nums1[r] = nums1[l];
                r--;
                l--;
            }
        }
        while(c >= 0){
            nums1[r] = nums2[c];
            r--;
            c--;
        }
    }
}