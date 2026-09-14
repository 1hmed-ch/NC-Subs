class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int l = 0;
        int r = arr1.length;
        int[] alph1 = new int[26];
        int[] alph2 = new int[26];
        for(int i = 0; i < arr1.length; i++){
            alph1[arr1[i] - 'a'] += 1;
        }
        for(int i = 0; i < arr1.length; i++){
            alph2[arr2[i] - 'a'] += 1;
        }
        while(l < r && r < arr2.length){
            //alph2[arr2[l] - 'a'] += 1;
            if(Arrays.equals(alph1, alph2)){
                return true;
            } else{
                alph2[arr2[l] - 'a'] -= 1;
                alph2[arr2[r] - 'a'] += 1;
                l++;
                r++;
            }
        }
        if(Arrays.equals(alph1, alph2)){
                return true;
        }
        return false;
    }
}
