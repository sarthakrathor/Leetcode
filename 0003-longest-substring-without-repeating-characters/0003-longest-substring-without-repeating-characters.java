class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charArr = new int[256];
        int max=0;
        int start = -1;
        Arrays.fill(charArr,-1);
        for(int i=0;i<s.length();i++){
            if(charArr[s.charAt(i)]>start) {
                start = charArr[s.charAt(i)];
            }
            charArr[s.charAt(i)] = i;
            max = Math.max(max,i-start);
        }
        return max;
    }
}