class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        int count = 0;

        int p = 0;
        for(int[] q : queries){
            for(int j = q[0]; j <= q[1]; j++){
                if((words[j].startsWith("a") || words[j].startsWith("e") || words[j].startsWith("i") || words[j].startsWith("o") || words[j].startsWith("u"))
                 && (words[j].endsWith("a") || words[j].endsWith("e") || words[j].endsWith("i") || words[j].endsWith("o") || words[j].endsWith("u"))){
                    count++;
                }
            }
            ans[p] = count;
            p++;
            count = 0;
        }

        return ans;
    }
}