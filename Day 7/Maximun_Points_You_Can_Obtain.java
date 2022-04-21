class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int max = 0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        max = sum;
        for(int i=cardPoints.length-1;i>=cardPoints.length-k;i--){
            if(max < sum+cardPoints[i]-cardPoints[(i+k)%cardPoints.length]){
                max = sum+cardPoints[i]-cardPoints[(i+k)%cardPoints.length];
                
            }
            sum = sum+cardPoints[i]-cardPoints[(i+k)%cardPoints.length];
        }
        return max;
    }
}
