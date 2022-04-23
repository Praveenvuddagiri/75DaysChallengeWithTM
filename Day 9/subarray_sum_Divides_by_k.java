class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int rem;
        int c=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem = sum%k;
            if(rem<0){
                rem+=k;
            }
            c+= map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return c;
    }
}
