class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1;
        int res=1;
        int prev = nums[0];
        while(j<nums.length){
            if(prev == nums[j]){
                j++;
            }
            else{
                prev = nums[j];
                
                nums[i]=prev;
                j++;
                i++;
            }
        }
        return i;
    }
}
