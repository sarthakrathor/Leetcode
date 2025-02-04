class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,new ArrayList<>(),ans);
        return ans;
    }

    static void helper(int[] nums, int n, List<Integer> curr, List<List<Integer>> ans){
        if(n == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        //include condition
        curr.add(nums[n]);
        helper(nums,n+1,curr,ans);

        //exclude condition
        curr.remove(curr.size()-1); // to avoid repetation of the last added index and backtrack accordingly
        helper(nums,n+1,curr,ans);

    }

    





}