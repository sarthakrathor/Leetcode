class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] pMax = new int[n];
        pMax[0] = height[0];
        for(int i=1;i<n;i++){
            pMax[i] = Math.max(pMax[i-1],height[i]);
        }

        int[] sMax = new int[n];
        sMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            sMax[i] = Math.max(sMax[i+1],height[i]);
        }

        int ans = 0;
        for(int i=0;i<n;i++){
            int leftMax = pMax[i];
            int rightMax = sMax[i];
            ans += Math.min(leftMax,rightMax) - height[i];
        }

        return ans;
    }
}