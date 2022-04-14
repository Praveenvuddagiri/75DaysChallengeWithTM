class Solution {
    public int pivotIndex(int[] nums) {
        int suml=0,sumr=0;
        for(int i=0;i<nums.length;i++){
            suml=sumr=0;
            for(int j = 0;j<i;j++){
                suml+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                sumr+=nums[j];
            }
            if(suml==sumr){
                return i;
            }
        }
        return -1;
    }
}
