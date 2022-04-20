class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int sum,start,end,res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            start = i+1;
            end = nums.length-1;
            while(start<end){
                sum=nums[start]+nums[end]+nums[i];
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    start++;
                }
                else{
                    end--;
                }
                if(min > Math.abs(target-sum)){
                    min=Math.abs(target-sum);
                    res = sum;
                }
            }
        }
        return res;
    }
}
