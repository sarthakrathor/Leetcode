class Solution {
    public boolean check(int[] nums) {
        int bp = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) bp++;
        }
        if(nums[nums.length-1]>nums[0]) bp++;
        
        return (bp<=1);
    }
}