class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int cur = 0;
        int max =0;
        for(int i=0;i<nums.length-1;i++){
            if(max<i+nums[i]){
                max = i+nums[i];
            }
            if(cur == i){
                jump++;
                cur = max;
            }
        }
        return jump;
    }
}
