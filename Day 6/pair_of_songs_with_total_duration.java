class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int c = 0;
        HashMap<Integer,Integer> res = new HashMap<>();
        int sum=0;
        int diff;
        for(int i=0;i<time.length;i++){
            sum = time[i] % 60;
            diff = sum==0?0:60 -sum;
            c+= res.getOrDefault(diff,0);
            res.put(sum,1+res.getOrDefault(sum,0));
        }
        return c;
    }
}
