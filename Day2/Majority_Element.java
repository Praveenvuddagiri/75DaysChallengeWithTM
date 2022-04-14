class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int cand = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==cand){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                cand = nums[i];
                count=1;
            }
        }
        return cand;
    }
}
