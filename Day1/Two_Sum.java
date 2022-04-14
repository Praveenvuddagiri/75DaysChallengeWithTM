class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int b = target - nums[i];
            if(map.containsKey(b)){
                res[1] = i;
                res[0] = map.get(b);
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
