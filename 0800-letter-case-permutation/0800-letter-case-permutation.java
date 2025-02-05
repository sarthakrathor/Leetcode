class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        helper(sb,0,ans);
        return ans;
    }

    void helper(StringBuilder sb,int i,List<String> ans){
        if( i == sb.length()){
            ans.add(sb.toString());
            return;
        }
        char c = sb.charAt(i);
        if(Character.isLetter(c)){
            sb.setCharAt(i,Character.toUpperCase(c));
            helper(sb,i+1,ans);
            sb.setCharAt(i,Character.toLowerCase(c));
            helper(sb,i+1,ans);
        }else{
            helper(sb,i+1,ans);
        }
    }
}