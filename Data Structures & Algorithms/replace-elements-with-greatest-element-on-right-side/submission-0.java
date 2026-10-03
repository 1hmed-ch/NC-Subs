class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            int r = n - 1;
            while(r > i){
                max = Math.max(max, arr[r]);
                r--;
            }
            result[i] = max;
            max = 0;
        }

        result[n-1] = -1;

        return result;
    }
}