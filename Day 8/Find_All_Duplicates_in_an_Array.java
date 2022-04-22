class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int x;
        for(int i=0;i<nums.length;i++){
            x = Math.abs(nums[i]);
            if(nums[x-1]<0){
                res.add(x);
                continue;
            }
            nums[x-1] = -nums[x-1];
        }
        return res;
    }
}
