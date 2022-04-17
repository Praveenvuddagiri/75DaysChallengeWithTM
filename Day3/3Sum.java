import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<ArrayList<Integer>> res = new LinkedHashSet<ArrayList<Integer>>();
        List<List<Integer> > res2 = new ArrayList<>();
        Arrays.sort(nums);
        int j=0;
        int k=nums.length-1;
        int x,z=0;
        for(int i=0;i<nums.length;i++){
            x= -1 * nums[i];
            j= i + 1;
            k= nums.length - 1;
            while(j<k){
               if(nums[j]+nums[k] == x){
                   ArrayList<Integer> temp = new ArrayList<Integer>();
                   temp.add(nums[i]);
                   temp.add(nums[j]);
                   temp.add(nums[k]);
                   res.add(temp);
                   z++;
                   j++;
                   k--;
               }
               else if(nums[j]+nums[k] > x){
                   k--;
               } 
               else{
                   j++;
               } 
            }
        }
        
        res2.addAll(res);
        return res2;
    }
}
