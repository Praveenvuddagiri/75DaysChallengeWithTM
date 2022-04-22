class Solution {
    public int findPairs(int[] nums, int k) {
        int res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i : map.keySet()){
            if(k>0 && map.containsKey(i+k) || k==0 && map.get(i)>1){
                res++;
            }
        }
        return res;
    }
}
