class Solution {
    public int firstMissingPositive(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }
        for(int i=1;i<nums.length+1;i++){
            if(!map.containsKey(i)){
               return i; 
            }
        }
        Arrays.sort(nums);
        return nums[nums.length-1]+1;
    }
}
