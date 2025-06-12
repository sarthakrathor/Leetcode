class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] pse = new int[heights.length];
        Stack<Integer> st1 = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st1.isEmpty() && heights[i]<=heights[st1.peek()]){
                st1.pop();
            }
            pse[i] = (st1.isEmpty())? -1:st1.peek();
            st1.push(i);
        }

        int[] nse = new int[heights.length];
        Stack<Integer> st2 = new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!st2.isEmpty() && heights[i]<=heights[st2.peek()]){
                st2.pop();
            }
            nse[i] = (st2.isEmpty())? heights.length:st2.peek();
            st2.push(i);
        }

        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int h = heights[i];
            int w = nse[i]-pse[i]-1;
            int area = h*w;
            maxi = Math.max(maxi,area);
        }

        return maxi;
    }
}