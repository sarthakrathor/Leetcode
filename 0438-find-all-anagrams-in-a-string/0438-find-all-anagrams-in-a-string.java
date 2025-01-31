class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sl = s.length();
        int pl = p.length();
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> mapP = new HashMap<>();
        for(int i=0;i<pl;i++){
            mapP.put(p.charAt(i),mapP.getOrDefault(p.charAt(i),0)+1);
        }

        int i = 0;
        for(int j=0;j<sl;j++){ //iterating through the main string
            window.put(s.charAt(j),window.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1 > pl){ // decrementing if window size increases
                window.put(s.charAt(i),window.getOrDefault(s.charAt(i),0)-1);
                if(window.get(s.charAt(i)) ==0 ) window.remove(s.charAt(i));
                i++;
            }

            if(j-i+1 == pl && mapP.equals(window)){
                ans.add(i);
            }
        }

        return ans;
    }
}