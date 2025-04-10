class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,dp,nums.length-1);

    }

    int helper(int[] nums,int[] dp,int n){
        if(n==0) return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        //steel
        int steel = helper(nums,dp,n-2)+nums[n];
        //notsteel
        int notsteel = helper(nums,dp,n-1);

        dp[n] = Math.max(steel,notsteel);
        return dp[n];
    }
}