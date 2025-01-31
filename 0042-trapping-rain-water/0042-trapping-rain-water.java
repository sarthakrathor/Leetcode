class Solution {
    public int trap(int[] height) {
        int[] pMax = new int[height.length];
        pMax[0] = height[0];
        for(int i=1;i<height.length-1;i++){
            pMax[i] = Math.max(pMax[i-1],height[i]);
        }

        int[] sMax = new int[height.length];
        sMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>0;i--){
            sMax[i] = Math.max(sMax[i+1],height[i]);
        }

        int ans = 0;
        for(int i=0;i<height.length;i++){
            int leftMax = pMax[i];
            int rightMax = sMax[i];
            if(height[i] < leftMax && height[i] < rightMax){
                ans += Math.min(rightMax,leftMax) - height[i];
            }
        }

        return ans;
    }
}