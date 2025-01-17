class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int start=0; int end=0; 
        int n = s.length(); int max=0;
        while(end<n){
            if (hash[s.charAt(end)] != -1) {
                start = Math.max(start, hash[s.charAt(end)] + 1);
            }
            int length = end - start + 1;
            max = Math.max(length, max);
            hash[s.charAt(end)] = end;
            end++;
        }

        return max;

    }
}