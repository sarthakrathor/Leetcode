class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int cz = 0;
        int ans = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] == 0) cz++;
            
            while(cz>k){
                if(nums[i] == 0) cz--;
                i++;
            }
            
            ans = Math.max(ans,j-i+1);
            
        }
        return ans;
    }
}