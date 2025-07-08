class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,target,ans,new ArrayList<>(),0);
        return ans;
    }

    void helper(int[] candidates, int target,List<List<Integer>> ans,List<Integer> arr,int i){
        if(i==candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }

        //pick
        if(candidates[i] <= target){
            arr.add(candidates[i]);
            helper(candidates,target-candidates[i],ans,arr,i);
            arr.remove(arr.size()-1);
        }
        
        //not pick
        helper(candidates,target,ans,arr,i+1);
    }
    
}