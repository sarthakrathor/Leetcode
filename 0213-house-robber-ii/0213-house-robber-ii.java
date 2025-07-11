class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

        Arrays.fill(dp, -1);
        int case1 = helper(Arrays.copyOfRange(nums, 0, n - 1), dp, n - 2);

        Arrays.fill(dp, -1);  // Reset dp[]
        int case2 = helper(Arrays.copyOfRange(nums, 1, n), dp, n - 2);
        
        return Math.max(case1,case2);

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