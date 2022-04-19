class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int k=matrix.length;
        int j = matrix[0].length;
        if(k==0 || j==0){
            return res;
        }
        int cs = 0;
        int ce = j-1;
        int rs = 0;
        int re = k-1;
        while(cs<=ce && rs<=re){
            for(int i=cs;i<=ce;i++){
                res.add(matrix[rs][i]);
            }
            rs++;
            for(int i=rs;i<=re;i++){
                res.add(matrix[i][ce]);
            }
            ce--;
            if(rs<=re){
                for(int i=ce;i>=cs;i--){
                    res.add(matrix[re][i]);
                }
                re--;
            }
            if(cs<=ce){
                for(int i=re;i>=rs;i--){
                    res.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        return res;
    }
}
