class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int zeroIndex = 0;
        int numIndex = 0;
        while(numIndex<len){
            if(nums[numIndex]==0){
                numIndex++;
            }else{
                if(numIndex == zeroIndex){
                    numIndex++;
                    zeroIndex++;
                }
                else{
                    nums[zeroIndex]=nums[numIndex];
                    nums[numIndex]=0;
                    numIndex++;
                    zeroIndex++;
                }
            }
        }
    }
}
