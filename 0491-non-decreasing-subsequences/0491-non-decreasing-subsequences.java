class Solution {
    public List<List<Integer>> findSubsequences(int[] nums){
        Set<List<Integer>> ans = new HashSet<>();
        helper(nums,0,ans,new ArrayList<>());
        return new ArrayList<>(ans);
    }

    void helper(int[] nums,int index,Set<List<Integer>> ans,List<Integer> arr){
        if(index==nums.length){
            if(arr.size()>=2){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }

        //pick
        if(arr.isEmpty() || (arr.get(arr.size()-1)<=nums[index])){
            arr.add(nums[index]);
            helper(nums,index+1,ans,arr);
            arr.remove(arr.size()-1);
        }
        
        //not pick
        helper(nums,index+1,ans,arr);
    }
}