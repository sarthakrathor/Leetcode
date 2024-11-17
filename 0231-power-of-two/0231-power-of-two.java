class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Check if n is a power of two
        return (n & (n - 1)) == 0;
    }
}