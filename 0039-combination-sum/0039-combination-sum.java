class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }

    void helper(int[] candidates,int target,int n,List<List<Integer>> ans, List<Integer> arr){
        if(n==candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }

        //pick
        if(candidates[n] <= target){
            arr.add(candidates[n]);
            helper(candidates,target-candidates[n],n,ans,arr);
            arr.remove(arr.size()-1);
        }
        helper(candidates,target,n+1,ans,arr);
    }
}