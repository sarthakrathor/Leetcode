class Solution {
    public int pivotIndex(int[] nums) {
        int tSum = 0;;
        for(int i=0;i<nums.length;i++){
            tSum += nums[i];
        }
        int leftSum =0;
        for(int i=0;i<nums.length;i++){
            if(leftSum == tSum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}