class Solution {
    public int maxArea(int h, int w, int[] hCuts, int[] vCuts) {
        Arrays.sort(hCuts);
        long max = hCuts[0];
        for(int i=1;i<hCuts.length;i++){
            if(max<hCuts[i]-hCuts[i-1]){
                max=hCuts[i]-hCuts[i-1];
            }
        }
        if(max<h-hCuts[hCuts.length-1]){
            max = h-hCuts[hCuts.length-1];
        }
        
        Arrays.sort(vCuts);
        
        int vmax = vCuts[0];
        for(int i=1;i<vCuts.length;i++){
            if(vmax<vCuts[i]-vCuts[i-1]){
                vmax=vCuts[i]-vCuts[i-1];
            }
        }
        if(vmax<w-vCuts[vCuts.length-1]){
            vmax = w-vCuts[vCuts.length-1];
        }
        
        long res = (max*vmax) % 1000000007;
        
        return (int)res;
    }
}
