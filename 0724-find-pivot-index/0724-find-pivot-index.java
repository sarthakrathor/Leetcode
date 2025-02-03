class Solution {
    public int pivotIndex(int[] nums) {
        int[] pSum = new int[nums.length];
        pSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            pSum[i] = pSum[i-1]+nums[i];
        }
        int[] sSum = new int[nums.length];
        sSum[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            sSum[i] = sSum[i+1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int leftSum = (i == 0) ? 0 : pSum[i-1];
            int rightSum = (i == nums.length-1) ? 0 : sSum[i+1];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}