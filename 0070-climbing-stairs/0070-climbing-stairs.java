class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        // return helper(n);
        // return memo(n,dp);
        // return tabu(n,dp);
        return spaceop(n);
    }

    int helper(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;

        int one = helper(n-1);
        int two = helper(n-2);
        return one+two;
    }

    int memo(int n,int[] dp){
        if(n==0 || n==1) dp[n]=1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = memo(n-1,dp)+memo(n-2,dp);
    }

    int tabu(int n,int[] dp){
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    int spaceop(int n) {
        if (n == 0 || n == 1) return 1;

        int prev2 = 1; // dp[0]
        int prev1 = 1; // dp[1]
        int curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2; // dp[i] = dp[i-1] + dp[i-2]
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}