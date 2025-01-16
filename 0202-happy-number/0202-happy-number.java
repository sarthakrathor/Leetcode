class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while(n!=1){
            if(set.contains(n)) return false;   
            set.add(n);
            n = sumDigits(n);
        }
        return true;
    }

    int sumDigits(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + (rem*rem);
            n = n/10;
        }
        return sum;
    }
}