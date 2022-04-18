class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int c=0;
        int sum=0;
        set.put(sum,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int diff = sum-k;
            if(set.containsKey(diff) ){
                c+=set.get(diff);
            }
            if(set.containsKey(sum))
                set.put(sum,set.get(sum)+1);
            else{
                set.put(sum,1);
            }
            
        }
        return c;
    }
}
