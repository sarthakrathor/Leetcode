class Solution {
    public int longestOnes(int[] nums, int k) {
         int cz = 0;
        int max = 0;
        int l = 0;
        int r = 0;
        while(r<nums.length){
            if(nums[r] == 0){
                cz++;
            }
            // if(cz>k){
                while(cz>k){
                    if(nums[l] == 0) cz--;
                    l++;
                }
            // }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}