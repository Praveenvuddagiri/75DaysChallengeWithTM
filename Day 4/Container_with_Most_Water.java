class Solution {
    public int maxArea(int[] height) {
        int max = 0, l=0, r=height.length-1;
        int area;
        
        while(l<r){
             area = Math.min(height[l],height[r])*(r-l);
            max = Math.max(max,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
