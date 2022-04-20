class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();
        int sum=0;
        int j,k;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int z=i+1;z<nums.length;z++){
                j=z+1;
                k=nums.length-1;
                while(j<k){
                    sum = nums[i]+nums[z]+nums[j]+nums[k];
                    if(target == sum){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);                        
                        temp.add(nums[z]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        res.add(temp);
                        j++;
                        k--;
                    }
                    else if(sum<target){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
