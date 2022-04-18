class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if(i>=0){
            int j=i+1;
            while(j<nums.length && nums[j]>nums[i]){
                j++;
            }
            int temp = nums[j-1];
            nums[j-1]=nums[i];
            nums[i]=temp;
        }
        int start = i+1;
        int end = nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }
}
