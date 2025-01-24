class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int start = 0;
        String res = "";
        for(int i =0;i<s.length();i++){
            char ss = s.charAt(i);
            if(ss == '(') st.push(ss);
            else{
                st.pop();
                if(st.isEmpty()){ //  empty stack means ss == ')' and it isis                                    the outermost parantheses 
                    res = res + s.substring(start+1,i);
                    start = i+1;
                }
            }
        }
        return res;


        
    }
}