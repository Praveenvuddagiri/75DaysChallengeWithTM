class Solution {
    public List<String> invalidTransactions(String[] tran) {
        List<String> res = new ArrayList<>();
        String temp[][] = new String[tran.length][4];
        for(int i=0;i<tran.length;i++){
            temp[i] = tran[i].split(",");
        }
        
        for(int i=0;i<temp.length;i++){
            if(Integer.parseInt(temp[i][2])>1000){
                res.add(temp[i][0]+","+temp[i][1]+","+temp[i][2]+","+temp[i][3]);
                
            }
        }
        
        for(int i=0;i<temp.length-1;i++){
            for(int j=i+1;j<temp.length;j++){
              if(Math.abs(Integer.parseInt(temp[i][1]) - Integer.parseInt(temp[j][1])) <= 60 ){
                    if(!temp[i][3].equals(temp[j][3]) && temp[i][0].equals(temp[j][0])){
                        String str1 = temp[i][0]+","+temp[i][1]+","+temp[i][2]+","+temp[i][3];
                        String str2 = temp[j][0]+","+temp[j][1]+","+temp[j][2]+","+temp[j][3];
                        
                        if(Collections.frequency(Arrays.asList(tran),str1) <= 1){
                            
                            res.remove(str1);
                        }
                        if(Collections.frequency(Arrays.asList(tran),str2) <= 1){
                            
                            res.remove(str2);
                        }
                        res.add(str1);
                        res.add(str2);
                    }
                }
            }
        }
        return res;
    }
}
