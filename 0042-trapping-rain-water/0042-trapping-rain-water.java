class Solution {
    public int trap(int[] height) {
        // int[] pmax = new int[height.length];
        // pmax[0] = height[0];
        // for(int i=1;i<height.length-1;i++){
        //     pmax[i] = Math.max(pmax[i-1],height[i]);
        // }

        // int[] smax = new int[height.length];
        // smax[height.length-1] = height[height.length-1];
        // for(int i=height.length-2;i>=0;i--){
        //     smax[i] = Math.max(smax[i+1],height[i]);
        // }

        // int ans = 0;
        // for(int i=0;i<height.length-1;i++){
        //     int lmax = pmax[i]; 
        //     int rmax = smax[i];
        //     if(height[i] < lmax && height[i] < rmax)
        //         ans += Math.min(lmax,rmax) - height[i];
        // }

        // return ans;

        int l = 0;
        int r = height.length-1;
        int lmax = height[0];
        int rmax = height[height.length-1];
        int ans = 0;

        while(l<r){
            if(height[l]<height[r]){
                if(height[l] < lmax){
                    ans += lmax - height[l];
                }else{
                    lmax = height[l];
                }
                l++;
            }else{
                if(height[r] < rmax){
                    ans += rmax - height[r];
                }else{
                    rmax = height[r];
                }
                r--;
            }
        }

        return ans;
   }
}