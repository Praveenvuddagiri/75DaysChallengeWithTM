class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> arr = new ArrayList<>();
        int temp[] = new int[2];
        temp[0] = intervals[0][0];
        temp[1] = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(temp[1] >= intervals[i][0]){
                temp[0] = Math.min(temp[0],intervals[i][0]);
                temp[1] = Math.max(temp[1],intervals[i][1]);
            }
            else{
                arr.add(temp);
                temp = intervals[i];
            }
        }
        arr.add(new int[]{temp[0],temp[1]});          
        return arr.toArray(new int[0][]);
    }
}
