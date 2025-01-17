class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int rsum=0;
        int lsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int sum = lsum;
        int n = cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[n];
            n=n-1;
            sum = Math.max(sum,lsum+rsum);
        }
        return sum;
        }
}