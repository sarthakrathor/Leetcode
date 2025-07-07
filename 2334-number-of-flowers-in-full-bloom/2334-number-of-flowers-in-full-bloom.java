class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<flowers.length;i++){
            map.put(flowers[i][0],map.getOrDefault(flowers[i][0],0)+1);
            map.put(flowers[i][1]+1,map.getOrDefault(flowers[i][1]+1,0)-1);
        }
        int[][]arr=new int[map.size()][2];
        int ind=0,val=0;
        for(int i:map.keySet()){
            arr[ind][0]=i;
            val+=map.get(i);
            arr[ind][1]=val;
            ind++;
        }
        ind=0;
        int[] ans=new int[people.length];
        for(int i=0;i<people.length;i++){
            int low=0,high=arr.length-1,pos=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid][0]<=people[i]){
                    low=mid+1;
                    pos=mid;
                }
                else high=mid-1;
            }
            if(pos==-1) ans[i]=0;
            else if(pos==arr.length-1 && arr[pos][1]!=people[i]) ans[i]=0;
            else ans[i]=arr[pos][1];
        }
        return ans;
    }
}