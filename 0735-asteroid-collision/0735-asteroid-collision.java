import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            boolean destroyed = false;

            
            while (!st.isEmpty() && st.peek() > 0 && curr < 0) {
                if (Math.abs(curr) > st.peek()) {
                    st.pop(); // top is destroyed, check again
                } else if (Math.abs(curr) == st.peek()) {
                    st.pop(); // both destroy
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // curr is destroyed
                    break;
                }
            }

            if (!destroyed) {
                st.push(curr);
            }
        }

       
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
