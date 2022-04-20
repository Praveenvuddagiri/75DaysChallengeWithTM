class Solution {
    public void gameOfLife(int[][] board) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int l=0,d=0;
                if(i>=1 && j>=1 && (board[i-1][j-1] == 1 || board[i-1][j-1] == 3) ){
                    l++;
                }else{
                    d++;
                }
                if(i>=1 && (board[i-1][j] == 1 || board[i-1][j] == 3) ){
                    l++;
                }else
                    d++;
                
                if(i>=1 && j<board[0].length-1 && (board[i-1][j+1] == 1 || board[i-1][j+1] == 3) ){
                    l++;
                }else
                    d++;
                
                if(j>=1 && (board[i][j-1] == 1 || board[i][j-1] == 3) ){
                    l++;
                }else
                    d++;
                
                if(j<board[0].length-1 && (board[i][j+1] == 1 || board[i][j+1] == 3) ){
                    l++;
                }else
                    d++;
                
                if(i<board.length-1 && j<board[0].length-1 && (board[i+1][j+1] == 1 || board[i+1][j+1] == 3) ){
                    l++;
                }else
                    d++;
                
                if(i<board.length-1 && (board[i+1][j] == 1 || board[i+1][j] == 3) ){
                    l++;
                }else
                    d++;
                
                if(i<board.length-1 && j >= 1&& (board[i+1][j-1] == 1 || board[i+1][j-1] == 3) ){
                    l++;
                }else
                    d++;
                
                // System.out.println(l+"  "+d);
                
                if(l<2 && board[i][j]==1){
                    board[i][j] = 3;
                }
                
                if( (board[i][j]==1)  && (l == 2 || l == 3)){
                    board[i][j]=1;
                }
                
                if(l > 3 && board[i][j] == 1){
                    board[i][j]=3;
                }
                
                if(l==3 && board[i][j]==0){
                    board[i][j] = 2;
                }
            }
            
            
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==2){
                    board[i][j] = 1;
                }
                if(board[i][j]==3){
                    board[i][j]=0;
                }
            }
        }
    }
}
