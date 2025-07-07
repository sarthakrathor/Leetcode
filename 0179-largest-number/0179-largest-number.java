class Solution {
    public String largestNumber(int[] nums) {
        String[] snum = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            snum[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(snum,(a,b) -> (b+a).compareTo(a+b));
        if(snum[0].equals('0')) return "0";

        StringBuilder ans = new StringBuilder();
        for(String s:snum){
            ans.append(s);
        }

        return ans.toString();
        
    }
}